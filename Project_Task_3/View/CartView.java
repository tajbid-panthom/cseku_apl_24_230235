package Grocery_Shop_Management_System_Task_3.Project_Task_3.View;
//***********************************************************************

// Title  : Grocery System View Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Cart;

/**
 * View class for displaying cart information.
 */
public class CartView {
    /**
     * Display the products
     * 
     * @param cart
     */
    public void displayCartDetails(Cart cart) {
        System.out.println(cart.getCartDetails());
    }

    /**
     * display the message
     * 
     * @param message
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
