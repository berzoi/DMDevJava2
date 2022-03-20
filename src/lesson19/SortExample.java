package lesson19;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("123", "456", "14", "5695");
//        Collections.sort(strings);
//        System.out.println(strings);

        List<Person> people = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(3, "Petr", "Petrov"),
                new Person(2, "Sveta", "Svetik")
        );

//        Collections.sort(people);
//        System.out.println(people);
//        Collections.sort(people, new FirstNameComparator());
        people.sort(Comparator.comparing(Person::getId).thenComparing(Person::getFirstName));
        System.out.println(people);
    }

//    public static class FirstNameComparator implements Comparator<Person> {
//
//        @Override
//        public int compare(Person o1, Person o2) {
//            return o1.getFirstName().compareTo(o2.getFirstName());
//        }
//    }

    /**
     *  1. Interface-ul Comparable permite de sortat doar printr-un pas (prin id, ca ex.)
     *  2. Interface-ul Comparator permite de sortat prin mai multi pasi
     *  3. Sou de folosit metodele statice din inteface-ul Comparator
     *   ex:     people.sort(Comparator.comparing(Person::getId).thenComparing(Person::getFirstName));
     */
}
