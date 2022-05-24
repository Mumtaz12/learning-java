package Section08.Banking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomerTest {
    @Test
    public void getName() {
        Customer customer = new Customer("Billy", 10.00);
        assertEquals("Billy", customer.getName());
    }

    @Test
    public void getNameFails() {
        Customer customer = new Customer("Billy", 10.00);
        assertNotEquals("Carl", customer.getName());
        
        double firstTransactionInBank = customer.getTransactions().get(0);
        assertEquals(10.00, firstTransactionInBank, 0.001);
    }

    @Test
    public void addAndgetBillysFirstTwoTransactions() {
        double firstTransaction = 10.00;
        Customer customer = new Customer("Billy", firstTransaction);

        double secondTransaction = 10.33;
        customer.addTransaction(secondTransaction);

        double firstTransactionInBank = customer.getTransactions().get(0);
        assertEquals(10.00, firstTransactionInBank, 0.001);

        double secondTransactionInBank = customer.getTransactions().get(1);
        assertEquals(secondTransaction, secondTransactionInBank, 0.001);
    }


    @Test
    public void addAndgetBillysFiveTransactions() {
        double firstTransaction = 10.00;
        Customer customer = new Customer("Billy", firstTransaction);

        ArrayList<Double> transactions = new ArrayList<>(Arrays.asList(10.30, 1000.00, 30.30, 1111.30, 1030.22, 30.29));
        for (int i = 0; i < transactions.size(); i++) {
            customer.addTransaction(transactions.get(i));
        }

        transactions.add(0, firstTransaction);

        ArrayList<Double> billysTransactions = customer.getTransactions();
        for (int i = 0; i < billysTransactions.size(); i++) {
            assertEquals(transactions.get(i), billysTransactions.get(i), 0.001);
        }
    }
}