package Section08.Banking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomerTest {
    @Test
    public void getName() {
        Customer customer = new Customer("Billy");
        assertEquals("Billy", customer.getName());
    }

    @Test
    public void getNameFails() {
        Customer customer = new Customer("Billy");
        assertNotEquals("Carl", customer.getName());
    }

    @Test
    public void addAndgetBillysTransaction() {
        Customer customer = new Customer("Billy");

        double transaction = 10.33;
        customer.addTransaction(transaction);
        double firstTransaction = customer.getTransactions().get(0);

        assertEquals(10.33, firstTransaction, 0.001);
    }

    @Test
    public void addAndgetBillysTwoTransactions() {
        Customer customer = new Customer("Billy");

        double transaction1 = 10.33;
        customer.addTransaction(transaction1);
        double transaction2 = 1000.00;
        customer.addTransaction(transaction2);

        ArrayList<Double> billysTransactions = customer.getTransactions();

        double firstTransaction = customer.getTransactions().get(0);
        assertEquals(10.33, firstTransaction, 0.001);

        double secondTransaction = customer.getTransactions().get(1);
        assertEquals(1000.00, secondTransaction, 0.001);

    }

    @Test
    public void addAndgetBillysFiveTransactions() {
        Customer customer = new Customer("Billy");

        ArrayList<Double> transactions = new ArrayList<>(Arrays.asList(10.30, 1000.00, 30.30, 1111.30, 1030.22, 30.29));
        for (int i = 0; i < transactions.size(); i++) {
            customer.addTransaction(transactions.get(i));
        }

        ArrayList<Double> billysTransactions = customer.getTransactions();
        for (int i = 0; i < billysTransactions.size(); i++) {
            assertEquals(transactions.get(i), billysTransactions.get(i), 0.001);
        }
    }
}