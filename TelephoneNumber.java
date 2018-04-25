public class TelephoneNumber implements Comparable<TelephoneNumber> {

    int countryCode;
    long localNumber;

    public TelephoneNumber(int countryCode, long localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public int compareTo(TelephoneNumber otherNumber) {
        return 0;
    }

}
