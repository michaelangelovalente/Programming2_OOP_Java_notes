package mooc_fi_2.part10.LambaFunctions;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lambda{
    public static void main(String args[]){
        // multiple wayst to write the same lambda expression


        //*stream*.filter(value->value>5).*furtherAction*

        /*
        *stream*.filter( (Integer value)-> {
            if( value > 5){
                return true
            }
        } )
        .*furtherAction*
         */

         //You can write it explicitly
         //in such a way that a static method
         //is defined in the program.

        // *stream*.filter(value->value>5).*furtherAction*

        // |
        // V

        //*stream*.filter(value->Screeners.greaterThanFive(value)).*furtherAction*

        //You can also pass the function directly as a parameter using the sytax below:
        //*stream*.filter(Screeners::greaterThanFive).*furtherAction* <--- "use the static greaterThanFive method that's in the Screeners class"


        //Functions that handle stream elements cannot change values of variables outside of the function.
        //You can altough read them, assuming that values do not change in the program.

        //Example where a function attemts to use a variable outside the function. ( it doesn't work)
        Scanner scanner = new Scanner( System.in );
        List<String> inputs = new ArrayList<>();

        while(true){
            String row = scanner.nextLine();
            if( row.equals("end")){
                break;
            }
            inputs.add(row);
        }

        int numberOfMappedValues = 0;

        // determining the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
            .mapToInt( s -> {
                //variable declared outside of an
                //anonymous function cannot be used!
                numberOfMappedValues++;
                return Integer.valueOf(s);
            }).filter( value -> value %3 == 0 )
            .count();




         

    }
}