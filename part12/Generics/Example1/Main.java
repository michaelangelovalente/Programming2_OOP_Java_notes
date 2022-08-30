
import java.util.Random;

public class Main{

    public static void main(String[] args){
        /*
        Locker<String> string = new Locker<>();
        string.setValue(":)");

        System.out.println(string.getValue());
        */
        /*
        Locker<Integer> integer = new Locker<>();
        integer.setValue( 5 );
        System.out.println( integer.getValue() );
         */
        /*
         Locker<Random> random = new Locker<>();
         random.setValue(new Random());

         System.out.println(random.getValue().nextDouble());
         System.out.println(random.getValue().nextDouble());
         System.out.println(random.getValue().nextDouble());
          */
          Pair<String, Locker<Integer>> pair = new Pair();
          pair.setValues("Test", new Locker());
          Locker lockerFromTest = pair.getSecond();
          lockerFromTest.setValue(5);

          System.out.println(pair.getFirst());
          System.out.println(pair.getSecond().getValue());

    }

}