package Grocery_Shop_Management_System_Task_3.Project_Task_3.Controller;
//***********************************************************************

// Title  : Grocery System Controller Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************
import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Cart;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Product;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.View.CartView;

/**
 * Controller class for managing Cart operations.
 */
public class CartController {
    private Cart model;
    private CartView view;

    /**
     * Construct the cart controller
     * 
     * @param model
     * @param view
     */
    public CartController(Cart model, CartView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Adding the product to cart
     * 
     * @param product
     */
    public void addProductToCart(Product product) {
        model.addProduct(product);
        view.displayMessage("Product added to cart successfully.");
    }

    /**
     * Removing the product the cart
     * 
     * @param product
     */
    public void removeProductFromCart(Product product) {
        model.removeProduct(product);
        view.displayMessage("Product removed from cart successfully.");
    }

    /**
     * Showing the cart details
     */
    public void showCartDetails() {
        view.displayCartDetails(model);
    }
}
