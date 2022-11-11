package com.platzi.platzimarket.domain.service;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    private int purchaseId;
    private String clientId;
    private LocalDateTime dates;
    private String paymentMethod;
    private String comment;
    private String state;

    List<PurchaseItem> item;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDates() {
        return dates;
    }

    public void setDates(LocalDateTime dates) {
        this.dates = dates;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PurchaseItem> getItem() {
        return item;
    }

    public void setItem(List<PurchaseItem> item) {
        this.item = item;
    }
}
