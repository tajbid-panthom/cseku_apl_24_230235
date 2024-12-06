package Grocery_Shop_Management_System_Task_3.Project_Task_3.Model;
//***********************************************************************

// Title  : Grocery System Model Structure
// Author : Md Tajbid Hossain, Mohima Mustari Mohi
//***********************************************************************

/**
 * Represents a staff member in the system.
 */
public class Staff {
    private int staffId;
    private String name;
    private String role;
    private double salary;

    /**
     * Constructs the staff details
     * 
     * @param staffId
     * @param name
     * @param role
     * @param salary
     */
    public Staff(int staffId, String name, String role, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStaffDetails() {
        return String.format("Staff ID: %d%nName: %s%nRole: %s%nSalary: %.2f", staffId, name, role, salary);
    }
}
