public class Company extends TelephoneEntry {

    String name, address;
    TelephoneNumber teleNumber;

    @Override
    public String description() {
        return name + "\n" + address;
    }

}
