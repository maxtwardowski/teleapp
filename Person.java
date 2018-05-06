public class Person extends TelephoneEntry {

    String name, lastName;

    public Person(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String description() {
        return name + " " + lastName + ", " + getAddress().street + ", " + getAddress().city + " " + getAddress().postalCode;
    }

    public Address getAddress() {
        return address;
    }

}
