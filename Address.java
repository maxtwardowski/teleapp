public class Address {

    String street, city, postalCode;
    TelephoneNumber teleNumber;

    public Address(String street, String city, String postalCode, TelephoneNumber teleNumber) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.teleNumber = teleNumber;
    }

    public TelephoneNumber getTeleNumber() {
        return teleNumber;
    }

}
