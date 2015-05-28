package pl.lodz.p.java;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Mateusz on 2015-05-28.
 */
public class PersonServiceTest {

    private List<Person> personList;
    private Person person2;
    private Person person1;

    @Before
    public void initialize() {
        personList = new ArrayList<>();
        person1 = new Person();
        person1.setFirstName("Zenon");
        person1.setLastName("Abacki");
        person1.setAge(30);
        personList.add(person1);
        person2 = new Person();
        person2.setAge(15);
        person2.setFirstName("Alicja");
        person2.setLastName("Babacka");
        personList.add(person2);
    }

    @Test
    public void shouldGetSumAges() throws Exception {
        PersonService sut = new PersonService();

        Assertions.assertThat(sut.getSumOfAges(personList)).isEqualTo(45);
    }

    @Test
    public void shouldSortByFirstName() throws Exception {
        PersonService sut = new PersonService();

        Assertions.assertThat(sut.sortByFirstName(personList)).contains(person1, person2).isSortedAccordingTo((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
    }

    @Test
    public void testSortByAges() throws Exception {
        PersonService sut = new PersonService();

        Assertions.assertThat(sut.sortByFirstName(personList)).contains(person1, person2).isSortedAccordingTo((o1, o2) -> o1.getAge() - o2.getAge());
    }
}