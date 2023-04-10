package com.mehr;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    List<CartItem> items = new LinkedList<>();
    Integer totalPrice = 0;
    Integer totalQuantity = 0;

    public void addItem(Item item, Integer quantity) {
        CartItem cartItem = new CartItem(item, quantity);
        items.add(cartItem);
        totalPrice += item.price * quantity;
        totalQuantity += quantity;
    }

    public List<String> itemizedList() {
        return items.stream().map(cartItem -> {
            if (cartItem.item.onSale) {
                return cartItem.item.name + " - x" + cartItem.quantity + " $" + cartItem.item.price + " highlighted";
            }
            return cartItem.item.name + " - x" + cartItem.quantity + " $" + cartItem.item.price;
        }).toList();

    }

    public void removeItem(String name) {
        for (CartItem cartItem : items) {
            if (cartItem.item.name == name) {
                if (cartItem.quantity > 1) {
                    cartItem.quantity -= 1;
                } else {
                    items.remove(cartItem);
                }
            }
        }
    }

}