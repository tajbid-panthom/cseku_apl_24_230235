package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

/**
 * Model class representing a Product.
 */
public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

    /**
     * constructs the Product
     * 
     * @param id
     * @param name
     * @param price
     * @param stock
     */
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Additional Methods
    public String getProductDetails() {
        return "Product[ID=" + id + ", Name=" + name + ", Price=$" + price + ", Stock=" + stock + "]";
    }
}
