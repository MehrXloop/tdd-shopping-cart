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
}
