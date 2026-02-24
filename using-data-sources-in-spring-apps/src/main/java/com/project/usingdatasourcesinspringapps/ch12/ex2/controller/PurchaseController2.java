package com.project.usingdatasourcesinspringapps.ch12.ex2.controller;

import com.project.usingdatasourcesinspringapps.ch12.ex2.model.Purchase2;
import com.project.usingdatasourcesinspringapps.ch12.ex2.repository.PurchaseRepository2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase2")
public class PurchaseController2 {

    private final PurchaseRepository2 purchaseRepository2;

    public PurchaseController2(PurchaseRepository2 purchaseRepository2) {
        this.purchaseRepository2 = purchaseRepository2;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase2 purchase2) {
        purchaseRepository2.storePurchase(purchase2);
    }

    @GetMapping
    public List<Purchase2> findPurchases() {
        return purchaseRepository2.findAllPurchases();
    }
}
