package Section08.Banking;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
    @Test
    public void addBranch() {
        Bank bank = new Bank("Big Bank");
        boolean isBranchAdded = bank.addBranch("Amsterdam");
        assertEquals(true, isBranchAdded);
    }

    @Test
    public void addBranchWithoutUniqueName() {
        Bank bank = new Bank("Big Bank");
        bank.addBranch("Amsterdam");
        boolean isBranchAdded = bank.addBranch("Amsterdam");
        assertEquals(false, isBranchAdded);
    }
}
