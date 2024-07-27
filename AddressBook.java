import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact findContactByName(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                return contact;
            }
        }
        return null;
    }

    public void editContact(Contact contact, String address, String city, String state, String zip, String phoneNumber, String email) {
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
    }
}