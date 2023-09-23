
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){

        List<Book> books = new ArrayList<>();
        books.add( new Book(new Person("ZName1", 1986), "name1", 345));
        books.add( new Book(new Person("BName2", 1987), "name2", 445));
        books.add( new Book(new Person("CName3", 1987), "name3", 545));
        books.add( new Book(new Person("DName4", 1988), "name4", 645));
        books.add( new Book(new Person("EName1", 1990), "name2", 745));

        books.add( new Book(new Person("FJ.K Name1", 1990), "name2Potter", 745));
        books.add( new Book(new Person("GJ.K Name2", 1990), "PotterName2", 745));
        books.add( new Book(new Person("AJ.K Name3", 1990), "potterName2", 745));


        //average of the authrs birthyears
        double average = books.stream()
            .map(book->book.getAuthor())
            .mapToInt( author->author.getBirthYear())
            .average()
            .getAsDouble();


        System.out.println("Average of the authors' birthyears: " + average);

        //Names of the authors of the books with the word "Potter"

        //my solution
        books.stream()
            .filter( book -> book.getName().contains("Potter"))
            .forEach( book -> System.out.println(book.getAuthor()));

        System.out.println();
        //solution
        books.stream()
            .filter(book->book.getName().contains("Potter"))
            .map(book->book.getAuthor())
            .forEach( author -> System.out.println(author));
        System.out.println();
        
        //prints "Author Name: Book" pairs arranged in alphabetical order
        books.stream()
            .map( book -> book.getAuthor() + ": " + book.getName())
            .sorted()
            .forEach(book->System.out.println(book));

        
    }
}