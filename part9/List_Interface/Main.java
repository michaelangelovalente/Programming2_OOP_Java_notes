import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String args[]){
        List<String> strings = new ArrayList<>();
        strings.add("string objects inside an arraylist object!");
        strings.add("string objects inside an arraylist object!");
        System.out.println(strings);

        List<String> strings2 = new LinkedList<>();
        strings2.add("string objects inside an arraylist object!");
        strings2.add("string objects inside an arraylist object!");
        System.out.println(strings2);

        

    }   
}