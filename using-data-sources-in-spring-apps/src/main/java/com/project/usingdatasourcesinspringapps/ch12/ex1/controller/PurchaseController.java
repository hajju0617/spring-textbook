package com.project.usingdatasourcesinspringapps.ch12.ex1.controller;

import com.project.usingdatasourcesinspringapps.ch12.ex1.repository.PurchaseRepository;
import com.project.usingdatasourcesinspringapps.ch12.ex1.model.Purchase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchases() {
        return purchaseRepository.findAllPurchases();
    }
}
