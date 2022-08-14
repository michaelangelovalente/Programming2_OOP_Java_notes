import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[]){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add( new Person("A Ada Lovelace 1", 1815));
        persons.add( new Person("C Irma Wyman 3", 1928));
        persons.add( new Person("B Grace Hooper 2", 1906));
        persons.add( new Person("D Mary Coombs 4", 1929));


        /*
        // If we don't want to implement Comparable, we can use the sorted() method from the stream
        // , the sorted() method accepts a lambda expression as a parameter that defines the sorting criteria
        //Specifically, it is provided with an object that implements the Comparator inferface, which
        //defines the desired order.
        persons.stream()
            .sorted( (p1, p2) -> {
                return p1.getBirthYear() - p2.getBirthYear();
            })
            .forEach( p-> System.out.println(p.getName()));
        System.out.println();

        persons.stream()
            .forEach( p-> System.out.println(p.getName()));
        
        System.out.println();

        //The Collections class also implements
        //sort() method that accepts a lamda expression as a parameter.
        Collections.sort(persons, (p1, p2 ) -> {
            return p1.getBirthYear() - p2.getBirthYear();
        });

        persons.stream()
            .forEach( p -> System.out.println(p.getName()));
         */
        //When comparing strings, we can use the compareTo method ( from the String class )
        persons.stream()
            .forEach( p -> System.out.println(p.getName()));

        System.out.println();

        persons.stream()
            .sorted( (p1, p2) -> p1.getName().compareTo(p2.getName()) )
            .forEach( p -> System.out.println(p.getName()) );
    }
}