package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

/**
 * Model class representing a GroceryProduct, which is a type of Product.
 */
public class GroceryProduct extends Product {

    private String productType; // Type of the grocery product (e.g. "Fruit", "Vegetable")

    /**
     * Construct the groceryProdect for details
     * 
     * @param id
     * @param name
     * @param price
     * @param stock
     * @param productType
     */
    public GroceryProduct(String id, String name, double price, int stock, String productType) {
        super(id, name, price, stock); // Call the superclass constructor
        this.productType = productType; // Set the grocery product type
    }

    // Getter and Setter for productType
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Overriding the getProductDetails method to include grocery-specific
     * information
     */
    @Override
    public String getProductDetails() {
        return super.getProductDetails() + ", Type=" + productType;
    }
}
