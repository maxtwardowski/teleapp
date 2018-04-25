import java.util.*;

public class TelephoneApp {

    public static void main(String[] args) {

        Person person1 = new Person("Max", "Twardowski", "Poland", 48, 606121217);
        Person person2 = new Person("Jędrzej", "Adamiec", "Rokiciny", 42, 112112112);
        Person person3 = new Person("Kiki", "Monke", "Zgiesh", 69, 420420420);

        Company company1 = new Company("Aksenczer", "Niggerya", 56, 454545987);
        Company company2 = new Company("Fuhitsu", "Raszia", 98, 978978456);
        Company company3 = new Company("Eriksun", "Cebulandia", 17, 465454781);

        TreeMap<Long, String> addressbook = new TreeMap<Long, String>();

        addressbook.put(person1.getTelephoneNumber(), person1.description());
        addressbook.put(person2.getTelephoneNumber(), person2.description());
        addressbook.put(person3.getTelephoneNumber(), person3.description());

        addressbook.put(company1.getTelephoneNumber(), company1.description());
        addressbook.put(company2.getTelephoneNumber(), company2.description());
        addressbook.put(company3.getTelephoneNumber(), company3.description());

        Iterator iterator = addressbook.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println(me.getKey() + " " + me.getValue());
        }

    }

}
