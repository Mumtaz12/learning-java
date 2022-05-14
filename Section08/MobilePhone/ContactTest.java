package Section08.MobilePhone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactTest {
    @Test
    public void createContactSuccessful() {
        Contact contact = Contact.createContact("Bob", "123 456");
        assertEquals("Bob", contact.getName());
        assertEquals("123 456", contact.getPhoneNumber());
    }
}
