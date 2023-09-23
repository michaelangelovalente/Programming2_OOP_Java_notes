
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Storer{

    public void write( String name, String text) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(name);
        writer.print(text);
        writer.close();
    }
    
}