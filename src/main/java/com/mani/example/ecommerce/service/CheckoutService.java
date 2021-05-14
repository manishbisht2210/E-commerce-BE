package com.mani.example.ecommerce.service;

import com.mani.example.ecommerce.dto.Purchase;
import com.mani.example.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
