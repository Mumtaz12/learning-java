package Section08.Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        // return true if added successfully, else false
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        // true if the customer was added successfully else false

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        // return if transaction was successful
        return false;
    }

    private Branch findBranch(String branchName) {
        // return branch
        return null;
    }

    private boolean listCustomers(String branchName, boolean printTransaction) {
        // return true if branch exists
        return false;
    }

}
