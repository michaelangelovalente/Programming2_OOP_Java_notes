public class Main{
    public static void main(String args[]){
        Book senseAsense = new Book("Sense and Sense", 1811, "....");
        Book prideAndPrej = new Book("Pride and Pred", 1813, "...");

        Library library = new Library();
        library.addBook(senseAsense);
        library.addBook(prideAndPrej);

        System.out.println(library.getBook("Pride and PRed "));
        System.out.println();
        System.out.println(library.getBook(" SENSE AND SENSE "));
        System.out.println();

        System.out.println(library.getBook(("SENSE")));
    }
}
