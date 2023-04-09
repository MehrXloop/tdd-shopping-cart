package com.mehr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    //AC 1 Given that I a new shopper, when I begin shopping, then I expect my cart to be empty.
    @Test
     void emptylist(){
        //Setup
        Cart cart = new Cart();
        //Assert
        assertEquals(0,cart.items.size());
     }
     //AC 2 Given I have an empty cart, when I add an Item, then I expect to the price reflect the sum of all the Items in my cart.

     @Test 
     void addItem(){
        //Setup
        Cart cart = new Cart();
        Item item1 = new Item("Watch", 2000, true);
        //Execute
        cart.addItem(item1,2);
        //Assert
        assertEquals(4000,cart.totalPrice);
     }

     //AC 3 Given I have cart with one item, when I add more of that item, then I expect to see its quantity update on the cart.
     @Test 
     void addMultipleItem(){
        //Setup
        Cart cart = new Cart();
        Item item1 = new Item("Watch", 2000, true);
        Item item2 = new Item("Bracelet", 4000, true);
        //Execute
        cart.addItem(item1,1);
        cart.addItem(item2,3);
        //Assert
        assertEquals(4,cart.totalQuantity);
     }


}
