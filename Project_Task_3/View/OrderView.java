package Grocery_Shop_Management_System_Task_3.Project_Task_3.View;
//***********************************************************************

// Title  : Grocery System View Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Order;

/**
 * View class for displaying order information.
 */
public class OrderView {
    /**
     * Display the order
     * 
     * @param order
     */
    public void displayOrderDetails(Order order) {
        System.out.println("Order Details:");
        System.out.println(order.getOrderDetails());
    }

    /**
     * Display the message
     * 
     * @param message
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
