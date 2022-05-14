package Section08.MobilePhone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MobilePhoneTest {

    @Test
    public void createContact() {
        MobilePhone mobilePhone = new MobilePhone("123 123");
        Contact newContact = new Contact("Bob", "444");
        mobilePhone.addNewContact(newContact);

        assertEquals(newContact, mobilePhone.queryContact("Bob"));
    }

    @Test
    public void searchUnknownContactFails() {
        MobilePhone mobilePhone = new MobilePhone("123 123");
        Contact newContact = new Contact("Bob", "444");
        mobilePhone.addNewContact(newContact);

        assertEquals(null, mobilePhone.queryContact("Carl"));
    }

    @Test
    public void removeContact() {
        MobilePhone mobilePhone = new MobilePhone("123 123");
        Contact newContact = new Contact("Bob", "444");
        mobilePhone.addNewContact(newContact);

        mobilePhone.removeContact(newContact);
        assertEquals(null, mobilePhone.queryContact("Bob"));
    }

    @Test
    public void updateContact() {
        MobilePhone mobilePhone = new MobilePhone("123 123");
        Contact oldContact = new Contact("Bob", "444");
        mobilePhone.addNewContact(oldContact);

        Contact newContact = new Contact("Carl", "666");
        mobilePhone.updateContact(oldContact, newContact);

        assertEquals(newContact, mobilePhone.queryContact("Carl"));
    }

    // how to test without console?
    @Test
    public void printAllContacts() {
        MobilePhone mobilePhone = new MobilePhone("123 123");
        mobilePhone.addNewContact(new Contact("Bob", "444"));
        mobilePhone.addNewContact(new Contact("Billy", "555"));
        mobilePhone.addNewContact(new Contact("Carl", "666"));

        mobilePhone.printContacts();
    }

}
