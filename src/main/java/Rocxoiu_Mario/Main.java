package Rocxoiu_Mario;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> peopleByName = new TreeSet<>(new NameComparator());
        TreeSet<Person> peopleByAge = new TreeSet<>(new AgeComparator());

        Person person1 = new Person("Pintilie", 43);
        Person person2 = new Person("Rocxoiu", 20);
        Person person3 = new Person("Popescu", 22);

        peopleByName.add(person1);
        peopleByName.add(person2);
        peopleByName.add(person3);

        System.out.println("People sorted by their name: " + peopleByName);
        for (Person person : peopleByName) {
            System.out.println(person);
        }
        System.out.println();

        peopleByAge.add(person1);
        peopleByAge.add(person2);
        peopleByAge.add(person3);

        System.out.println("People sorted by their age: " + peopleByAge);
        for (Person person : peopleByAge) {
            System.out.println(person);
        }

        Country romania = new Country("Romania");
        Country spain = new Country("Spain");

        Address bucuresti = new Address(romania);
        Address madrid = new Address(spain);

        Hobby skydiving = new Hobby("Sky Diving", 3, Collections.singletonList(bucuresti));
        Hobby football = new Hobby("Football", 3, Arrays.asList(bucuresti, madrid));

        Map<Person, List<Hobby>> peopleByHobby = new HashMap<>();
        peopleByHobby.put(person1, Arrays.asList(skydiving, football));
        peopleByHobby.put(person2, Collections.singletonList(skydiving));
        peopleByHobby.put(person3, Collections.singletonList(football));

        System.out.println();
        System.out.println("Hobbies of Pintilie: ");
        List<Hobby> hobbies = peopleByHobby.get(person1);
        if (hobbies != null) {
            for (Hobby hobby : hobbies) {
                System.out.print(hobby.getName() + " can be practiced in: ");
                for (Address address : hobby.getAddresses()) {
                    System.out.print(address.getCountry().getName() + " ");
                }
                System.out.println();
            }
        }
    }
}
