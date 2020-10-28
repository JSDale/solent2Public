/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.cart.service.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import org.solent.com504.oodd.cart.model.service.ShoppingCart;
import org.solent.com504.oodd.cart.service.ServiceObjectFactory;
import org.solent.com504.oodd.cart.model.dto.ShoppingItem;
import org.solent.com504.oodd.cart.service.ShoppingCartImpl;

/**
 *
 * @author cgallen
 */
public class ShoppingCartTest {

    ShoppingCart shoppingCart = null;

    @Before
    public void before() {
        shoppingCart = ServiceObjectFactory.getNewShoppingCart();

    }

    @Test
    public void test1() {
        assertNotNull(shoppingCart);
    }
    
    @Test
    public void test_AddItemToCart() {
        ShoppingItem item = new ShoppingItem("car", 50000.00);
        ShoppingCartImpl cart = new ShoppingCartImpl();
        cart.addItemToCart(item);
        
        List<ShoppingItem> items = cart.getShoppingCartItems();
        ShoppingItem listItem = items.get(0);
        
        assertEquals(item, listItem);
    }

    // add your own tests here
}
