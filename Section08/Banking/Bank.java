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
        if (findBranch(branchName) != null) {
            return false;
        }
        Branch newBranch = new Branch(branchName);
        branches.add(newBranch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (findBranch(branchName) != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (findBranch(branchName) != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        System.out.println("Customer details for branch " + branch.getName());
        for (int i = 0; i < branch.getCustomers().size(); i++) {
            System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            if (printTransaction) {
                System.out.println("Transactions");
                for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j + 1) + "]  Amount " + branch.getCustomers().get(i).getTransactions().get(j));
                }
            }
        }
        return true;
    }
}
