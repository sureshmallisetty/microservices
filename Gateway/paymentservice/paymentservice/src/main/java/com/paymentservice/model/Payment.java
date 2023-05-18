package com.paymentservice.model;

public class Payment {
    private String paymentType;
    private Double amount;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                '}';
    }
}