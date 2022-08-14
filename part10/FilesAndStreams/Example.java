
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example{
    public static void main(String args[]){
        /*List<String> rows = new ArrayList<>();

        try{
            // lines method in the files class allows you to create an input stream from a file,
            //this allows you to process the rows one by one.
            Files.lines(Paths.get("file.txt")).forEach(row->rows.add(row)); // Path class creates a path used by the lines method as a param.
        }catch( Exception e ){
            System.out.println("Error: " + e.getMessage());
        }
        */
        //Reading the details of a person in a file called 'presidents.txt'
        List<Person> presidents = new ArrayList<>();
        try{
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get("presidents.txt"))
            //splitting the rows into parts on the ";" character
            .map( row -> row.split(";") )
            //deleting the split rows that have less than 2 parts
            //(we want the rows to always contain both the name and the birth year)
            .filter( parts -> parts.length >= 2)
            //create Persons from the parts
            .map( parts -> {
                String name[] = parts[0].split(" ");
                String lastName = "";
                for( int i = 1; i < name.length; i++) {
                    lastName += (name[i] + " ");
                }
                return new Person(name[0], lastName, Integer.valueOf(parts[1].trim()));
            })//new Person( parts[0].split(" ")[0], parts[0].split(" ")[1] + " " + parts[0].split(" ")[2], Integer.valueOf(parts[1]) ))
            // add the persons to the list
            .forEach( person -> presidents.add(person));

        }catch( Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Result: ");
        /*presidents.stream()
            .forEach( president -> System.out.println(president));*/
        presidents.stream()
            .map( president -> "First Name: " + president.getFirstName() + "\nLast Name: " + president.getLastName() + "\nDate of birth: " + president.getBirthYear() + "\n")
            .forEach( president -> System.out.println(president));
    }
}