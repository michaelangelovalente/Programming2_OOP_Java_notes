
import java.util.Scanner;

public class Example{
    public static void main(String args[]){
        /*System.out.print("Provide a student number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if( number.matches("01[0-9]{7}")){
            System.out.println("Correct format.");
        }else{
            System.out.println("Incorrect format.");
        }*/
        /*
        String string = "001";

        if(string.matches("00|111|0000")){
            System.out.println("The string contained one of the three alternatives");
        }else{
            System.out.println("The string contained none of the alternatives");
        }
         */
        /*
        String string = "carz";

        if(string.matches("car(|s|)")){
            System.out.println("The string contained one of the three alternatives");
        }else{
            System.out.println("The string contained none of the alternatives");
        }
         */
        /*
        //The quantifier * repeats 0 ... times, for example;
        String string = "trolololololo";
        if( string.matches("tro(lo)*")){
            System.out.println("Correct form.");
        }else{
            System.out.println("Incorrect form.");
        }
         */
        /*
        //The quantifier + repeats 1..times
        String string = "trolololo";

        if( string.matches("tro(lo)+")){
            System.out.println("Correct form.");
        }else{
            System.out.println("Incorrect form.");
        }
         
        String string = "nananananananana Batmaan!";
        if(string.matches("(na)+ Batmaan!")){
            System.out.println("Correct form.");
        }else{
            System.out.println("Incorrect form!");
        }
        */
        /*
        //The quantifier ? repeats 0 or 1 times
        String string = "You have to accidentally delete the whole meme";
        if( string.matches("You have to accidentally (delete)? the whole meme")){
            System.out.println("Correct form.");
        }else{
            System.out.println("Incorrect form.");
        }
         */
        /*
        //The quantifier {a} repeats a times
        String string = "101010";
        if(string.matches("(10){2}")){
            System.out.println("Correct form.");
        }else{
            System.out.println("Incorrect form.");
        }
         */
        /*
        //The quantifier {a,b} repeats a ... b times, for example:
        //String string = "1";
        StringBuilder builder  = new StringBuilder();
        for( int i = 0; i <= 6; i++ ){
            builder.append("1");
            System.out.print(builder.toString() + " ");
            if(builder.toString().matches("1{2,4}")){
                System.out.println("Correct form");
            }else{
                System.out.println("Incorrect form");
            }
        }
         */

        /*
        //The quantifier {a,} repeats a ... times.
        StringBuilder builder = new StringBuilder();
        for( int i = 0; i <= 6; i++ ){
            builder.append("1");
            System.out.print(builder.toString() + " ");
            if(builder.toString().matches("1{2,}")){
                System.out.println("Correct form");
            }else{
                System.out.println("Incorrect form");
            }
        }
         */
        String string = "555555";
        if(string.matches("5{3}(1|0)*5{3}")){
            System.out.println("Correct form.");
        }else{
            System.out.println("Incorrect form.");
        }
        

    }
}