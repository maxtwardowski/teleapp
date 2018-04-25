public class TelephoneNumber implements Comparable<TelephoneNumber> {

    int countryCode;
    long localNumber;

    public TelephoneNumber(int countryCode, long localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public int compareTo(TelephoneNumber otherNumber) {

        long teleNumberCombined = (long) (localNumber + countryCode * Math.pow(10, String.valueOf(localNumber).length()));
        long otherteleNumberCombined = (long) (otherNumber.localNumber + otherNumber.countryCode * Math.pow(10, String.valueOf(otherNumber.localNumber).length()));

        if (teleNumberCombined > otherteleNumberCombined)
            return 1;
        else if (teleNumberCombined == otherteleNumberCombined)
            return 0;
        else
            return -1;
    }

}
