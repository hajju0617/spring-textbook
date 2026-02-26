package com.project.usingtransactionsinspringapps.ch13.ex2.controller;

import com.project.usingtransactionsinspringapps.ch13.ex2.dto.TransferRequest;
import com.project.usingtransactionsinspringapps.ch13.ex2.model.Account;
import com.project.usingtransactionsinspringapps.ch13.ex2.service.TransferService2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController2 {

    private final TransferService2 transferService2;

    public AccountController2(TransferService2 transferService2) {
        this.transferService2 = transferService2;
    }

    @PostMapping("/transfer2")
    public void transferMoney(@RequestBody TransferRequest request) {
        transferService2.transferMoney(request.getSenderAccountId(),
                                       request.getReceiverAccountId(),
                                       request.getAmount());
    }

    @GetMapping("/accounts2")
    public List<Account> getAllAccounts() {
        return transferService2.getAllAccounts();
    }
}
