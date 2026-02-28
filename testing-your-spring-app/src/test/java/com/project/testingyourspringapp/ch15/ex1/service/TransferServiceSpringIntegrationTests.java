package com.project.testingyourspringapp.ch15.ex1.service;

import com.project.testingyourspringapp.ch15.ex1.model.Account;
import com.project.testingyourspringapp.ch15.ex1.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
class TransferServiceSpringIntegrationTests {
    @MockitoBean    // 가짜 객체 생성(스프링 컨텍스트 안의 진짜 Bean을 가짜로 교체), (통합 테스트용)
    private AccountRepository accountRepository;
    @Autowired
    private TransferService transferService;

    @Test
    void transferAmountTest() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account receiver = new Account();
        receiver.setId(2);
        receiver.setAmount(new BigDecimal(1000));

        Mockito.when(accountRepository.findById(1L)).thenReturn(Optional.of(sender));
        Mockito.when(accountRepository.findById(2L)).thenReturn(Optional.of(receiver));

        transferService.transferMoney(1, 2, new BigDecimal(100));
        Mockito.verify(accountRepository).changeAmount(1, new BigDecimal(900));
        Mockito.verify(accountRepository).changeAmount(2, new BigDecimal(1100));
    }

}
