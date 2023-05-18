package com.paymentservice.service;


import com.paymentservice.model.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {
    List<Payment> paymentList = new ArrayList<>();

    public Boolean addPaymentList(Payment payment){
        paymentList.add(payment);
        return true;
    }

    public List<Payment> getPaymentList(){
        return paymentList;
    }
}