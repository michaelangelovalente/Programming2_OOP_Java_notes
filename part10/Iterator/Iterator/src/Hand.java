import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Hand{

    private List<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    /*Prints the cards without using an Iterator
    public void print(){
        this.cards.stream().forEach( card -> {
            System.out.println(card);
        });
    }
     */
    //ArrayList implment the Collection interface, that implements the Iterable interface.
    //These contain an Iterator an object designed to go through a particular object collection.
    //Example:
    public void print(){
        Iterator<Card> iterator = cards.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            /**
             * Alternative
             * Object reference of the iterator's next()
             * can also be stored in an object
             * Card = nextInLine = iterator.next()
             * System.out.println(nextInLine);
             */
        }

    }

    // We create a method that removes cards from a given stream with a value lower than the 
    // given value.
    public void removeWorst(int value){

        /*
        This give a ConcurrentModificationException 
        //When you the forEach method, it is assumed that the list is not modified during the traversal.
        //Modifying the list causes an errpr

        this.cards.stream().forEach( card -> {
            if( card.getValue() < value ){
                cards.remove(card);
            }
        });
         */

         //A way that works to remove some of the objects from the list  during the traversal, is done by using the
         // iterator.
         Iterator<Card> iterator = cards.iterator();

        while( iterator.hasNext()){
           if( iterator.next().getValue() < value){
               //removes from the list
               //the element returned by the previous next-method call
               iterator.remove();//
           }
        }
        
    }
}