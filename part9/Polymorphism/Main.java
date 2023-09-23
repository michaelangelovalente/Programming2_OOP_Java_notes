import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;


public class Main{
    public static void main(String args[]){
    /*
        Printer  printer = new Printer();
    
        String string = " o ";
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTimes(string , 4);
        System.out.println();
        printer.printManyTimes(words, 3);
     */
    /*
        Serializable serializableString = "string serializable";
        CharSequence charSequenceString = "string CharSeq";
        Comparable<String> comparableString = "string comparable";
     */        
    Printer printer = new Printer();
    String string = "works!";
    printer.printCharacter(string);
    



    }
    
}