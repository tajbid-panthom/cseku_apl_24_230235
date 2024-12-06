package Grocery_Shop_Management_System_Task_3.Project_Task_3.View;
//***********************************************************************

// Title  : Grocery System View Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Product;

/**
 * View class for displaying product information.
 */
public class ProductView {
    /**
     * display the products
     * 
     * @param product
     */
    public void displayProductDetails(Product product) {
        System.out.println("Product Details:");
        System.out.println(product.getProductDetails());
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
