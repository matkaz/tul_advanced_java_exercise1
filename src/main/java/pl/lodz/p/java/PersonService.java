package pl.lodz.p.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Mateusz on 2015-05-28.
 */
public class PersonService {
    public int getSumOfAges(List<Person> people) {
//        int sum = 0;
//        for (Person person : people) {
//            sum += person.getAge();
//        }
//
//        return sum;
        return people.stream().mapToInt(value -> value.getAge()).sum();
    }

    public List<Person> sortByFirstName(List<Person> people) {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        return people;
    }

    public List<Person> sortByAges(List<Person> people) {
        Collections.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());
        return people;
    }
}
