package com.project.usingtransactionsinspringapps.ch13.ex2.service;

import com.project.usingtransactionsinspringapps.ch13.ex2.model.Account;
import com.project.usingtransactionsinspringapps.ch13.ex2.repository.AccountRepository2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService2 {
    private final AccountRepository2 accountRepository2;

    public TransferService2(AccountRepository2 accountRepository2) {
        this.accountRepository2 = accountRepository2;
    }

    @Transactional
    public void transferMoney(long idSender, long idReceiver, BigDecimal amount) {
        Account sender = accountRepository2.findAccountById(idSender);
        Account receiver = accountRepository2.findAccountById(idReceiver);
        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

        accountRepository2.changeAmount(idSender, senderNewAmount);
        accountRepository2.changeAmount(idReceiver, receiverNewAmount);

        // 런타임 에러로 인해 트랜잭션이 롤백 되는지 테스트.
        throw new RuntimeException("RuntimeException: Transactional Failed");
    }
    public List<Account> getAllAccounts() {
        return accountRepository2.findAllAccounts();
    }
}
