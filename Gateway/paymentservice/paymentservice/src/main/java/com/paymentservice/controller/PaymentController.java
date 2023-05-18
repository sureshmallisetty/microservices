package com.paymentservice.controller;


import com.paymentservice.model.Payment;
import com.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/payment")
    public List<Payment> getPaymentList(){
        return paymentService.getPaymentList();
    }

    @PostMapping("/payment")
    public Boolean addPaymentList(@RequestBody Payment payment){
        paymentService.addPaymentList(payment);
        return true;
    }
}
