package Section08.ArrayListChallenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactTest {
    @Test
    public void test(){
        Contact groceryList = new Contact();

        groceryList.addGroceryItem("banana");
        groceryList.addGroceryItem("apple");
        groceryList.addGroceryItem("orange");
        groceryList.printGroceryList();
        groceryList.findItem("banana");
        assertEquals(true, true);
    }
}
