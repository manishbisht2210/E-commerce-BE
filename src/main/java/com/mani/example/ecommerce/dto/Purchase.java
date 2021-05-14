package com.mani.example.ecommerce.dto;

import com.mani.example.ecommerce.entity.Address;
import com.mani.example.ecommerce.entity.Customer;
import com.mani.example.ecommerce.entity.Order;
import com.mani.example.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
