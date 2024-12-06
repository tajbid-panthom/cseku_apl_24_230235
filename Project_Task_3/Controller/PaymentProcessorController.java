package Grocery_Shop_Management_System_Task_3.Project_Task_3.Controller;
//***********************************************************************

// Title  : Grocery System Controller Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************
import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.PaymentProcessor;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.View.PaymentProcessorView;

/**
 * Controller class for managing PaymentProcessor operations.
 */
public class PaymentProcessorController {
    private PaymentProcessor model;
    private PaymentProcessorView view;

    /**
     * Constructs the payment processor with model and view
     * 
     * @param model
     * @param view
     */
    public PaymentProcessorController(PaymentProcessor model, PaymentProcessorView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updating the amount
     * 
     * @param amount
     */
    public void updateAmount(double amount) {
        model.setAmount(amount);
        view.displayMessage("Payment amount updated to " + amount);
    }

    /**
     * Showing the payment process
     */
    public void processPayment() {
        String details = model.processPayment();
        view.displayPaymentDetails(details);
    }
}
