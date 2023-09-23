
import java.util.ArrayList;

public class Book{
    private String name;
    private String publisher;
    private ArrayList<Person> author;

    public ArrayList<Person> getAuthors(){
        return this.author;
    }

    public void addAuthor(Person author){
        this.author.add(author);
    }
}