public class Company extends TelephoneEntry {

    String name, address;
    TelephoneNumber teleNumber;

    public Company(String name, String address, int countryCode, int localNumber) {
        TelephoneNumber teleNumber = new TelephoneNumber(countryCode, localNumber);
        this.name = name;
        this.address = address;
        this.teleNumber = teleNumber;
    }

    public long getTelephoneNumber() {
        return (long) (teleNumber.localNumber + teleNumber.countryCode * Math.pow(10, String.valueOf(teleNumber.localNumber).length()));
    }

    @Override
    public String description() {
        return name + "\n" + address;
    }

}
