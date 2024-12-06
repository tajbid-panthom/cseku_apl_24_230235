package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

/**
 * Processes payments via offline methods (e.g., cash, check).
 */
public class OfflinePaymentProcessor extends PaymentProcessor {
    private String receiptNumber;

    public OfflinePaymentProcessor(double amount) {
        super(amount);
    }

    @Override
    public String processPayment() {
        receiptNumber = "RCP" + System.currentTimeMillis();
        return "Offline payment of " + amount + " processed. Receipt Number: " + receiptNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }
}
