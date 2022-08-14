import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class Main{
    public static void main(String args[]){
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));


        for( Film film : films){
            System.out.println(film);
        }
        System.out.println();

        //Comparator provides the methods 'comparing' and 'thenComapring' for sorting.
        //Comparing and then comparing are given a reference to the object's type
        //The method reference is given as Class:method
        Comparator<Film> comparator =  Comparator
            .comparing( Film::getReleaseYear)
            .thenComparing(Film::getName);
        
        Collections.sort(films, comparator);

        for( Film film : films ){
            System.out.println(film);
        }


        

    }

    

}