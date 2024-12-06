package Grocery_Shop_Management_System_Task_3.Project_Task_3.View;
//***********************************************************************

// Title  : Grocery System View Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Customer;

/**
 * View class for displaying customer information.
 */
public class CustomerView {
    /**
     * Display the customer
     * 
     * @param customer
     */
    public void displayCustomerDetails(Customer customer) {
        System.out.println("Customer Details:");
        System.out.println(customer.getCustomerDetails());
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
