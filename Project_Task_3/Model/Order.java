package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import java.util.Date;

/**
 * Model class representing an Order.
 */
public class Order {
    private String orderId;
    private Customer customer;
    private Cart cart;
    private Date orderDate;

    /**
     * Construct the order details
     * 
     * @param orderId
     * @param customer
     * @param cart
     * @param orderDate
     */
    public Order(String orderId, Customer customer, Cart cart, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.cart = cart;
        this.orderDate = orderDate;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * to get the order of a customer
     * 
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * To set the customer for order
     * 
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * to get the customer's cart
     * 
     * @return
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * To set the customer's cart
     * 
     * @param cart
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    /**
     * Date of the order
     * 
     * @return
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Set the date
     * 
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    // Additional Methods
    public String getOrderDetails() {
        return "Order[ID=" + orderId + ", Customer=" + customer.getCustomerDetails() +
                ", Cart=" + cart.getCartDetails() + ", Date=" + orderDate + "]";
    }
}
