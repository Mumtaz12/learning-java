package Section08.Banking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BranchTest {
    @Test
    public void createBranch(){
       Branch branch = new Branch("Billy");

       assertEquals("Billy", branch.getName());
    }
}
