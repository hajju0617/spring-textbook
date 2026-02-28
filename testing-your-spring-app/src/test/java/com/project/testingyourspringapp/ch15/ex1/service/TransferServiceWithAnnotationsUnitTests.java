package com.project.testingyourspringapp.ch15.ex1.service;

import com.project.testingyourspringapp.ch15.ex1.exception.AccountNotFoundException;
import com.project.testingyourspringapp.ch15.ex1.model.Account;
import com.project.testingyourspringapp.ch15.ex1.repository.AccountRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)     // @Mock, @InjectMocks 에노테이션 활성화.
class TransferServiceWithAnnotationsUnitTests {
    @Mock   // 가짜 객체 생성. (단위 테스트용)
    private AccountRepository accountRepository;
    @InjectMocks    // TransferService 객체를 생성하고 그 안에 @Mock으로 만든 객체들을 자동으로 주입.
    private TransferService transferService;

    @Test
    @DisplayName("정상 작동 테스트 (에노테이션 이용)")
    void transferMoney() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));

        BDDMockito.given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));
        BDDMockito.given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));

        transferService.transferMoney(sender.getId(),
                destination.getId(),
                new BigDecimal(100));

        Mockito.verify(accountRepository).changeAmount(1, new BigDecimal(900));
        Mockito.verify(accountRepository).changeAmount(2, new BigDecimal(1100));
    }

    @Test
    @DisplayName("예외 발생 테스트")
    void transferMoneyException() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        BDDMockito.given(accountRepository.findById(1L)).willReturn(Optional.of(sender));
        BDDMockito.given(accountRepository.findById(2L)).willReturn(Optional.empty());
        Assertions.assertThrows(AccountNotFoundException.class, () -> transferService.transferMoney(1, 2, new BigDecimal(100)));
        Mockito.verify(accountRepository, Mockito.never()).changeAmount(Mockito.anyLong(), Mockito.any());
    }

}
