
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main{
    public static void main(String[] args)/* throws FileNotFoundException  */{
        /*
        PrintWriter writer = new PrintWriter("file.txt");
        writer.println("Hello file!");
        writer.print("More text");
        writer.println(" and some extra text.");
        writer.close();
         */
        Storer storer = new Storer();
        String in = "\nHello file! Hello file\nHello file! Hello file!\nHello file!Hello file!\tHello file!";

        storer.write("file.txt", in );

        
    }
}