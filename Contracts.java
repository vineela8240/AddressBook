public class Contracts {
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public String Zip;
    public String PhoneNumber;
    public String Email;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public Contracts(String FirstName, String LastName, String Address, String City, String State, String Zip, String PhoneNumber, String Email){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address=Address;
        this.City=City;
        this.State=State;
        this.Zip=Zip;
        this.PhoneNumber=PhoneNumber;
        this.Email=Email;
    }

}
