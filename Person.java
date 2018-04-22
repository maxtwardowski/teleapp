public class Person extends TelephoneEntry {

    String name, lastName, address;
    TelephoneNumber teleNumber;

    @Override
    public String description() {
        return name + " " + lastName + "\n" + address;
    }

}
