import java.util.Random;


public class Raffle {

    public static void main(String[] args){
        Random ladyLuck = new Random(); // create Random object

        for( int i = 0; i < 10; i ++ ){
            // Draw and print a random number
            int randomNumber = ladyLuck.nextInt(10);
            System.out.println(randomNumber);
        }

    }

}