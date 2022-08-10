
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Statistics{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while(true){
            String row = scanner.nextLine();
            if( row.equals("end")){
                break;
            }

            inputs.add(row);
        }
        
        // counting the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
            .map( s -> Integer.valueOf(s))
            .filter(number -> number %3 == 0)
            .count(); // returns the coun of elements in the stream.


        // working out the average
        double average = inputs.stream()
            .mapToInt( s-> Integer.valueOf(s))
            .average()
            .getAsDouble();

        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);
            

    }
}