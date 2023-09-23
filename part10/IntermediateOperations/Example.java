import java.util.ArrayList;

public class Example{
    public static void main(String args[]){
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Michael", "Valente", 1995));
        persons.add(new Person("Giovanni", "Valente", 1985));
        persons.add(new Person("Angelica", "Valente", 1975));
        persons.add(new Person("Arasmus", "Valente", 1965));
        persons.add(new Person("Francesco", "Valente", 1875));
        persons.add(new Person("Elisabetta", "Valente", 2001));
        persons.add(new Person("Anastasia", "Valente", 2001));

        persons.add(new Person("Francesco", "Macca", 1875));
        persons.add(new Person("Elisabetta", "Macca", 2001));
        persons.add(new Person("Anastasia", "Macca", 2001));

        //Prob 1: From a list of persons. Print the number of persons born before the year 1970.
        long count = persons.stream()
            .filter( person -> person.getBirthYear() < 1970)
            .count();
        System.out.println(count + "\n");

        //Prob 2: You have a list of Persons. How many persons first name star with the letter "A"?
        long count2 = persons.stream()
            .filter( person -> person.getFirstName().startsWith("A"))
            .count();
        System.out.println(count2+"\n");
        
        //Prob 3: You'll receive a list of persons. Print the number of unique first names in alphabetical
        // order.
        persons.stream()
            .map( fName -> fName.getFirstName() ) // Changes the Stream containing person objects to a stream containing (String) first names
            .distinct() // uses equals-method contained in all objects
            .sorted() // sorts objects that contain a relative order (for example numbers and strings )
            .forEach( name -> System.out.println(name));
    }
}