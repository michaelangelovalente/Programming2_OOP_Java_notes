import java.util.HashMap;

public class Library{
    private HashMap<String, Book> directory;

    public Library(){
        this.directory = new HashMap<>();
    }

    public void addBook(Book book){
        String name = santizedString( book.getName() );
        if( this.directory.containsKey(name)){

        }else{
            this.directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle){
        bookTitle = santizedString(bookTitle);
        return this.directory.get(bookTitle);
    }


    public void removeBook(String bookTitle){
        bookTitle = santizedString( bookTitle );
        if( this.directory.containsKey(bookTitle)) {
            this.directory.remove( bookTitle );
        }else{
            System.out.println("Book was not found!\n");
        }
    }

    public static String santizedString( String string ){
        if( string == null){
            return "";
        }
        return string.toLowerCase().trim();
    }

}