
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.stream.Collector;

public class Example{
    public static void main(String args[]){
        /*
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-6);
        values.add(8);

        System.out.println("Values: " + values.stream().count()+"\n");
        values.stream()
            .filter( val -> val%2 == 0)
            .forEach( val -> System.out.println(val));
        System.out.println();

        //'collect' method is used to collect stream values into another collection.
        
        ArrayList<Integer> positives = values.stream()
            .filter( val -> val > 0 )
            .collect(Collectors.toCollection(ArrayList::new)); // <-- creates a new ArrayList object that holds the collected values.

        positives.stream()
            .forEach( val -> System.out.println(val));
         */

         /*
        List<Integer> numbers = new ArrayList<>();
        for( int i = 0; i < 10; i++ ){
            numbers.add(i);
        }

        long howManyNumbers = numbers.stream()
            .filter( i -> i < 4)
            .map( i -> i *2 )
            .filter( i -> i > 10)
            .count();
        System.out.println( howManyNumbers);
         */
        /*
        ArrayList<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);
         */
        //reducee format:
        /*
            reduce(*initialState*, (*previous*, *object*) -> *actions on the object*)
        */
        /*
        int sum = values.stream()
            .reduce(0, (previousSum, value)-> previousSum + value);
        System.out.println(sum);
         */

        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");

        String combined = words.stream()
            .reduce("", (previousString, word)-> previousString + word + "\n");
        System.out.println(combined);
    }
}