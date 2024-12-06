package Grocery_Shop_Management_System_Task_3.Project_Task_3.View;
//***********************************************************************

// Title  : Grocery System View Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

import Grocery_Shop_Management_System_Task_3.Project_Task_3.Model.Staff;

/**
 * View class for displaying staff information.
 */
public class StaffView {
    /**
     * Display the staff details
     * 
     * @param staff
     */
    public void displayStaffDetails(Staff staff) {
        System.out.println("Staff Details:");
        System.out.println(staff.getStaffDetails());
    }

    /**
     * Display the message
     * 
     * @param message
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
