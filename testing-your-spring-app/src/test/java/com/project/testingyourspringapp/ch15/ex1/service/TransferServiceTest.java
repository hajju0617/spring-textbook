package com.project.testingyourspringapp.ch15.ex1.service;

import com.project.testingyourspringapp.ch15.ex1.model.Account;
import com.project.testingyourspringapp.ch15.ex1.repository.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TransferServiceTest {

    @Test
    @DisplayName("정상작동 테스트")
    void transferMoney() {
        // Mockito의 mock() 메서드로 AccountRepository 객체에 대한 모의 인스턴스를 생성.
        AccountRepository accountRepository = Mockito.mock(AccountRepository.class);

        TransferService transferService = new TransferService(accountRepository);

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
}