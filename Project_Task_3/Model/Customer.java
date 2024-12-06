package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

/**
 * Model class representing a Customer.
 */
public class Customer {
    private String id;
    private String name;
    private String email;

    /**
     * construct the customer details
     * 
     * @param id
     * @param name
     * @param email
     */
    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Additional Methods
    public String getCustomerDetails() {
        return "Customer[ID=" + id + ", Name=" + name + ", Email=" + email + "]";
    }
}
