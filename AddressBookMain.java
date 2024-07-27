import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter contact details:");

                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Address: ");
                    String address = scanner.nextLine();

                    System.out.print("City: ");
                    String city = scanner.nextLine();

                    System.out.print("State: ");
                    String state = scanner.nextLine();

                    System.out.print("ZIP: ");
                    String zip = scanner.nextLine();

                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(newContact);

                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.println("Enter the name of the contact to edit:");

                    System.out.print("First Name: ");
                    String editFirstName = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String editLastName = scanner.nextLine();

                    Contact contactToEdit = addressBook.findContactByName(editFirstName, editLastName);
                    if (contactToEdit != null) {
                        System.out.println("Enter new details:");

                        System.out.print("Address: ");
                        String newAddress = scanner.nextLine();

                        System.out.print("City: ");
                        String newCity = scanner.nextLine();

                        System.out.print("State: ");
                        String newState = scanner.nextLine();

                        System.out.print("ZIP: ");
                        String newZip = scanner.nextLine();

                        System.out.print("Phone Number: ");
                        String newPhoneNumber = scanner.nextLine();

                        System.out.print("Email: ");
                        String newEmail = scanner.nextLine();

                        addressBook.editContact(contactToEdit, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);
                        System.out.println("Contact updated successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.println("Current contacts in address book:");
                    addressBook.displayContacts();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}