package Section08.Banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {

        return false;
    }

    private Customer findCustomer(String customerName) {

        // make a loop through the list
        // find the customer with if(this.customers.get(i).getName().equals(nameOfCustomer)){}
        // return it if found, else return null
        return null;
    }
}
