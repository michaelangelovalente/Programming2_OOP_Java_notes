

import java.util.Scanner;


public class Main{
    public static void main(String args[]){


        Scanner reader = new Scanner(System.in);

        /*
        System.out.println("Give a number: ");
        int readNumber = -1;

        try{
            readNumber = Integer.parseInt(reader.nextLine()); //cath is executed immediately if the code in the try block throws an exception
            System.out.println("Good job!");
        }catch( NumberFormatException nfe){
            System.out.println("User input was not a number.");
        }
         */
        System.out.println("Value: " + readNumber(reader));

    }

    public static int readNumber(Scanner reader ){
        while( true ){
            System.out.print("Give a number: ");

            try{
                int readNumber = Integer.parseInt(reader.nextLine());
                return readNumber;
            }catch(NumberFormatException nfe ){
                System.out.println("User input was not a number.");
            }
        }
    }
}