package Grocery_Shop_Management_System_Task_3.Project_Task_3.Controller;
//***********************************************************************

// Title  : Grocery System Controller Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************
import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Product;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.View.ProductView;

/**
 * Controller class for managing Product operations.
 */
public class ProductController {
    private Product model;
    private ProductView view;

    /**
     * constructs the prodect model and view
     * 
     * @param model
     * @param view
     */
    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updating the product price
     * 
     * @param price
     */
    public void updateProductPrice(double price) {
        model.setPrice(price);
        view.displayMessage("Product price updated successfully.");
    }

    /**
     * Updating the product stock
     * 
     * @param stock
     */
    public void updateProductStock(int stock) {
        model.setStock(stock);
        view.displayMessage("Product stock updated successfully.");
    }

    /**
     * Showing the product details
     */
    public void showProductDetails() {
        view.displayProductDetails(model);
    }
}
