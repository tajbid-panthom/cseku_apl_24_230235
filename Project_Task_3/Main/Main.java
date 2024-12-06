package Grocery_Shop_Management_System_Task_3.Project_Task_3.Main;

import Grocery_Shop_Management_System_Task_3.Project_Task_3.Controller.*;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.*;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.View.*;

public class Main {
    public static void main(String[] args) {
        // Initialize Models
        Product apple = new GroceryProduct("G123", "Apple", 1.99, 100, "Fruit");
        Product banana = new GroceryProduct("G124", "Banana", 0.99, 200, "Fruit");

        // Initialize Staff
        Staff staff1 = new Staff(001, "John Doe", "Cashier", 23456);

        // Payment Processor
        PaymentProcessor onlinePayment = new OnlinePaymentProcessor(4500);
        PaymentProcessor offlinePayment = new OfflinePaymentProcessor(3400);

        // Initialize Views
        ProductView productView = new ProductView();
        StaffView staffView = new StaffView();
        PaymentProcessorView paymentView = new PaymentProcessorView();

        // Initialize Controllers
        ProductController productController = new ProductController(apple, productView);
        StaffController staffController = new StaffController(staff1, staffView);
        PaymentProcessorController paymentController = new PaymentProcessorController(onlinePayment, paymentView);

        // Display Product Details
        System.out.println("Product Details:");
        productController.showProductDetails();
        productController.showProductDetails();

        // Process Payment
        System.out.println("\nProcessing Payment:");
        paymentController.processPayment();
        paymentController.processPayment();

        // Display Staff Details
        System.out.println("\nStaff Details:");
        staffController.showStaffDetails();

        // Simulating more business logic
        System.out.println("\nUpdating Product Stock:");
        apple.setStock(120);
        productController.showProductDetails();
    }
}
