import java.util.*;

public class TelephoneApp {

    public static void main(String[] args) {

        ArrayList<TelephoneEntry> addressList = new ArrayList<TelephoneEntry>();

        addressList.add(new Person("Max", "Twardowski", new Address("Kierpcowa 5", "Łódź", "92-413", new TelephoneNumber(48, 606121217))));
        addressList.add(new Person("Jędrzej", "Adamiec", new Address("Północna 74", "Rokiciny", "82-948", new TelephoneNumber(15, 123548321))));
        addressList.add(new Person("Mikołaj", "Żujewski", new Address("Renesansowa 92", "Zgierz", "59-482", new TelephoneNumber(78, 164712012))));
        addressList.add(new Person("Mateusz", "Roganowicz", new Address("Sosnowska 67", "Radom", "12-051", new TelephoneNumber(65, 645291349))));
        addressList.add(new Company("IFE", new Address("Żwirki 7", "Łódź", "97-491", new TelephoneNumber(59, 236126781))));
        addressList.add(new Company("DMCS", new Address("Wólczańska B18", "Łódź", "98-463", new TelephoneNumber(15, 123456789))));

        TreeMap<TelephoneNumber, TelephoneEntry> addressBook = new TreeMap<TelephoneNumber, TelephoneEntry>();

        Iterator addressListIterator = addressList.iterator();

        while (addressListIterator.hasNext()) {
            TelephoneEntry entry = (TelephoneEntry) addressListIterator.next();
            addressBook.put(entry.getAddress().getTeleNumber(), entry);
        }

        for (Map.Entry<TelephoneNumber, TelephoneEntry> entry : addressBook.entrySet()) {
            System.out.println("Key: " + entry.getKey().countryCode + "-" + entry.getKey().localNumber + ". Value: " + entry.getValue().description());
        }

    }

}
