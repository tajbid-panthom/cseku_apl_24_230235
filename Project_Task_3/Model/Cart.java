package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import java.util.ArrayList;
import java.util.List;

/**
 * Model class representing a Cart.
 */
public class Cart {
    private List<Product> products;

    /**
     * Construct the Cart method to add the products
     */
    public Cart() {
        products = new ArrayList<>();
    }

    /**
     * Add products in the cart
     * 
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * remove products in the cart
     * 
     * @param product
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * To get the products
     * 
     * @return
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * to get the total price
     * 
     * @return
     */
    public double getTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * to get the cat product details
     * 
     * @return
     */
    public String getCartDetails() {
        StringBuilder details = new StringBuilder("Cart:\n");
        for (Product product : products) {
            details.append(product.getProductDetails()).append("\n");
        }
        details.append("Total: $").append(getTotalCost());
        return details.toString();
    }
}
