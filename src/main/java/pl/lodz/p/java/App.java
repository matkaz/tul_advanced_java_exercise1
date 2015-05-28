package pl.lodz.p.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person = new Person();
        person.setFirstName("Mateusz");
        person.setLastName("Kaźmierczak");
        person.setAge(21);
        System.out.print(person.getFirstName() + " " + person.getLastName() + " l. " + person.getAge());
    }
}
