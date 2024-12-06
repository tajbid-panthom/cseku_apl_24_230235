package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

/**
 * Abstract base class for payment processing.
 */
public abstract class PaymentProcessor {
    protected double amount;

    /**
     * Construct the payment processor details
     * 
     * @param amount
     */
    public PaymentProcessor(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract String processPayment();
}
