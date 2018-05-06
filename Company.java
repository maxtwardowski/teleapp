public class Company extends TelephoneEntry {

    String name;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String description() {
        return name + ", " + getAddress().street + ", " + getAddress().city + " " + getAddress().postalCode;
    }

    public Address getAddress() {
        return address;
    }

}
