package com.lzw.service;


import com.lzw.bean.Cart;

public interface OrderService {
    public String createOrder(Cart cart, Integer userId);
}
