package Grocery_Shop_Management_System_Task_3.Project_Task_3.Controller;
//***********************************************************************

// Title  : Grocery System Controller Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************
import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Customer;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.View.CustomerView;

/**
 * Controller class for managing Customer operations.
 */
public class CustomerController {
    private Customer model;
    private CustomerView view;

    /**
     * Constructs the customer model and view
     * 
     * @param model
     * @param view
     */
    public CustomerController(Customer model, CustomerView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updating the customer name
     * 
     * @param name
     */
    public void updateCustomerName(String name) {
        model.setName(name);
        view.displayMessage("Customer name updated successfully.");
    }

    /**
     * updating the customer email
     * 
     * @param email
     */
    public void updateCustomerEmail(String email) {
        model.setEmail(email);
        view.displayMessage("Customer email updated successfully.");
    }

    /**
     * Showing the customers details
     */
    public void showCustomerDetails() {
        view.displayCustomerDetails(model);
    }
}
