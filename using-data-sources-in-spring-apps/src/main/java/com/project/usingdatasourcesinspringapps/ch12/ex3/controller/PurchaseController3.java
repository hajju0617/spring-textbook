package com.project.usingdatasourcesinspringapps.ch12.ex3.controller;

import com.project.usingdatasourcesinspringapps.ch12.ex3.model.Purchase3;
import com.project.usingdatasourcesinspringapps.ch12.ex3.repository.PurchaseRepository3;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase3")
public class PurchaseController3 {

    private final PurchaseRepository3 purchaseRepository3;

    public PurchaseController3(PurchaseRepository3 purchaseRepository3) {
        this.purchaseRepository3 = purchaseRepository3;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase3 purchase3) {
        purchaseRepository3.storePurchase(purchase3);
    }

    @GetMapping
    public List<Purchase3> findPurchases() {
        return purchaseRepository3.findAllPurchases();
    }
}
