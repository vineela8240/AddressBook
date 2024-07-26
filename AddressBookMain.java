import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        AddressBook addressbook=new AddressBook();
        System.out.println("Enter the address book details:");

        System.out.println("Enter FirstName:");
        String FirstaName=sc.nextLine();

        System.out.println("Enter SecondName");
        String SecondName=sc.nextLine();

        System.out.println("Enter Your Address");
        String Address=sc.nextLine();

        System.out.println("Enter Your City");
        String City=sc.nextLine();

        System.out.println("Enter Your State");
        String State=sc.nextLine();

        System.out.println("Enter Your Zip");
        String Zip=sc.nextLine();

        System.out.println("Enter Your PhoneNumber");
        String PhoneNumber=sc.nextLine();

        System.out.println("Enter Your Email");
        String Email=sc.nextLine();

        Contact newContact=new Contact(FirstaName,SecondName,Address,City,State,Zip,PhoneNumber,Email);
        addressbook.addContact(newContact);
        System.out.println("Contact Added Successfully!!");
        System.out.println("Current contacts i n address book");
        addressbook.displayContacts();
    }
}
