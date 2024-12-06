package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

/**
 * Processes payments via online methods.
 */
public class OnlinePaymentProcessor extends PaymentProcessor {
    private String transactionId;

    public OnlinePaymentProcessor(double amount) {
        super(amount);
    }

    @Override
    public String processPayment() {
        transactionId = "TXN" + System.currentTimeMillis();
        return "Online payment of " + amount + " processed. Transaction ID: " + transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
