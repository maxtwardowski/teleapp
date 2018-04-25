public class Person extends TelephoneEntry {

    String name, lastName, address;
    TelephoneNumber teleNumber;

    public Person(String name, String lastName, String address, int countryCode, int localNumber) {
        TelephoneNumber teleNumber = new TelephoneNumber(countryCode, localNumber);
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.teleNumber = teleNumber;
    }

    public long getTelephoneNumber() {
        return (long) (teleNumber.localNumber + teleNumber.countryCode * Math.pow(10, String.valueOf(teleNumber.localNumber).length()));
    }

    @Override
    public String description() {
        return name + " " + lastName + "\n" + address;
    }

}
