import java.util.ArrayList;


public class Example{
    public static void main(String args[]){
       /*StringBuilder numbers = new StringBuilder();
        for( int i = 0; i < 5; i++ ){
            numbers.append(i);
        }
        //System.out.println(numbers);
        System.out.println(numbers.toString());
        */

        ArrayList<String> words = new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");

        StringBuilder connectedString = new StringBuilder();
        for( int i = 0; i < words.size(); i ++){
            
            connectedString.append(words.get(i));
            connectedString.append(" ");
        }
        System.out.println(connectedString.toString());


    }
}