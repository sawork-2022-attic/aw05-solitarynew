package com.micropos.carts.service;

import com.micropos.carts.model.Cart;
import com.micropos.carts.model.Item;
import com.micropos.carts.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public Cart add(Cart cart, String productId, int amount) {
        Product product = new Product(productId, "", 0, "");
        if (product == null) return cart;

        cart.addItem(new Item(product, amount));
        return cart;
    }
}
