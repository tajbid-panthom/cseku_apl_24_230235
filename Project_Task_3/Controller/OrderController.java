package Grocery_Shop_Management_System_Task_3.Project_Task_3.Controller;
//***********************************************************************

// Title  : Grocery System Controller Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Order;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.View.OrderView;

/**
 * Controller class for managing Order operations.
 */
public class OrderController {
    private Order model;
    private OrderView view;

    /**
     * Constructs the order model and view
     * 
     * @param model
     * @param view
     */
    public OrderController(Order model, OrderView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updating the order date
     * 
     * @param date
     */
    public void updateOrderDate(java.util.Date date) {
        model.setOrderDate(date);
        view.displayMessage("Order date updated successfully.");
    }

    /**
     * Showing the order details
     */
    public void showOrderDetails() {
        view.displayOrderDetails(model);
    }
}
