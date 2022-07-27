package FUND.P22ObjectAndClassesEX;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person gosho = new Person("Gosho", 23, "Sofia");
        System.out.println(gosho.getName());
        System.out.println(gosho.getAge());
        System.out.println(gosho.getTown());

        gosho.setAge(21);
        System.out.println(gosho.getAge());

        Person pesho = new Person("Pesho", 21, "Plovdiv");

        Person veso = new Person("Veso", 27, "Pz");

        List<Person> persons = new ArrayList<>();
        persons.add(gosho);
        persons.add(pesho);
        persons.add(veso);

        for (Person chovek : persons) {
            System.out.println(chovek.getName());
        }

    }
}
