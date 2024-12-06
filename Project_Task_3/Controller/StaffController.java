package Grocery_Shop_Management_System_Task_3.Project_Task_3.Controller;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************
import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Staff;
import Grocery_Shop_Management_System_Task_3.Project_Task_3.View.StaffView;

/**
 * Controller class for managing Staff operations.
 */
public class StaffController {
    private Staff model;
    private StaffView view;

    /**
     * Construct the staff model and view
     * 
     * @param model
     * @param view
     */
    public StaffController(Staff model, StaffView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Updating the staff name
     * 
     * @param name
     */
    public void updateStaffName(String name) {
        model.setName(name);
        view.displayMessage("Staff name updated successfully.");
    }

    /**
     * Updating the staff role
     * 
     * @param role
     */
    public void updateStaffRole(String role) {
        model.setRole(role);
        view.displayMessage("Staff role updated successfully.");
    }

    /**
     * updating the salary
     * 
     * @param salary
     */
    public void updateStaffSalary(double salary) {
        model.setSalary(salary);
        view.displayMessage("Staff salary updated successfully.");
    }

    /**
     * Showing the staff details
     */
    public void showStaffDetails() {
        view.displayStaffDetails(model);
    }
}
