/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

/**
 *
 * @author shrutimehta
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import business.person.PersonDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private PersonDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {
        Admin("Admin"),
        Design("Design"),
        Manufacture("Manufacture"),
        Reporting("Reporting"),
        Inventory("Inventory"),
        CarCompanyStaff("Car Company Staff"),
        Customer("Customer"),
        Store("Store"),
        QualityCheck("Quality Check");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        ++counter;
        organizationID = counter;

    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PersonDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(PersonDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    @Override
    public String toString() {
        return name;
    }

}
