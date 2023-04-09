package com.mehr;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    List<CartItem> items = new LinkedList<>();
    Integer totalPrice = 0;
    Integer totalQuantity =0;

   public void addItem(Item item , Integer quantity){
     CartItem cartItem = new CartItem(item, quantity);
     items.add(cartItem);
     totalPrice += item.price * quantity;
     totalQuantity += quantity;
   }
}
