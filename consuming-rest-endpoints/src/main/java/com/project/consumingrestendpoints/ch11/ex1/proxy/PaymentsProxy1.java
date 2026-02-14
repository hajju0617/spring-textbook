package com.project.consumingrestendpoints.ch11.ex1.proxy;

import com.project.consumingrestendpoints.ch11.ex1.model.Payment1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments", url = "${name.service.url}")
public interface PaymentsProxy1 {
    @PostMapping("/payment")
    Payment1 createPayment(@RequestHeader String requestId,
                           @RequestBody Payment1 payment1);
}
