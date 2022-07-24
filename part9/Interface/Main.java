import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
      /*
        TextMessage message = new TextMessage("ope", "It's going great!");
        System.out.println(message.read());

        ArrayList<TextMessage> textMessage = new ArrayList<>();
        textMessage.add(new TextMessage("private number", "I hid the body."));

        System.out.println(textMessage);
        */
        /*
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, reable enteties.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);
        int page = 0;
        while( page < book.pages()){
            System.out.println(book.read());
            page = page + 1;
        }
         */



        /*
        TextMessage message = new TextMessage("ope", "Something cool's about to happen");
        Readable readable = new TextMessage("ope", "The text message is Readable!");
        System.out.println(readable);
        System.out.println(message);
        System.out.println(readable.getClass());
        System.out.println(message.getClass());
        */

        /*
        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");
        pages.add("A method can call itself.");


        Readable book = new Ebook("Introduction to recursion", pages);
        int page = 0;
        while( page < book.pages()){
            System.out.println(book.read());
            page = page + 1;
        }
         */
        /*
        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add( new TextMessage("ope", "never been programming before..."));
        readingList.add( new TextMessage("ope", "gonna love it i think!"));
        readingList.add( new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add( new TextMessage("ope", "you think i can do it?"));
        readingList.add( new TextMessage("ope", "up here we send several messages each day"));

        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");
        
        readingList.add(new Ebook("Introduction to Recursion.", pages));

        for( Readable readable: readingList){
            System.out.println(readable.read());
        }
        System.out.println("-------------------");

        for( Readable readable :readingList ){
            System.out.println(readable.getClass());
        }
         */
        /*
         Readable readable = new TextMessage("ope", "TextMessage is Readable!");
         TextMessage message = readable; //does not work!
         //you have to cast it!
         TextMessage castMessage = (TextMessage)readable;
         */

        /*
        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5}.");
        Ebook book = new Ebook("Introduction to Math.", pages);

        Printer printer = new Printer();
        printer.print(book);
        printer.print(message);
         */

        ReadingList jonisList = new ReadingList();
        jonisList.add( new TextMessage( "arto", "have you written the tests yet?" ) );
        jonisList.add( new TextMessage( "arto", "have you checked the submissions yet?" ) );

        /*
        //Ebook: The Hitchiker's guide to the galaxy.
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Don't Panic.");
        pages.add("Would it save you a lot of time if I just gave up and went mad now?");
        pages.add("Don't Panic.");
        pages.add("Would it save you a lot of time if I just gave up and went mad now?");
        pages.add("Don't Panic.");
        pages.add("Would it save you a lot of time if I just gave up and went mad now?");
        pages.add("Don't Panic.");
        pages.add("Would it save you a lot of time if I just gave up and went mad now?");
        jonisList.add( new Ebook("The Hitchhiker's Guide to the Galaxy", pages));
        */

        int i = 0;
        while( i < 10){
            jonisList.add( new TextMessage("arto", "have you written the tests yet?") );
            i = i+1;
        }
        System.out.println("Joni has to read: " + jonisList.toRead());
        //System.out.println("Joni's to-read: \n" + jonisList.read());
        //System.out.println("Joni has to read: " + jonisList.toRead());

        System.out.println("Delegating the reading to Verna.");

        ReadingList vernasList = new ReadingList();
        System.out.println("Verna's to read: " + vernasList.toRead());
        vernasList.add(jonisList);
        vernasList.read();

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());





    }

}