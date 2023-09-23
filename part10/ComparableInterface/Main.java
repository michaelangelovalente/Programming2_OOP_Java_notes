import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String args[]){
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikael", 182));
        member.add(new Member("matti", 187));
        member.add(new Member("ada", 184));


        member.stream()
            .forEach( m -> System.out.println(m));

        System.out.println();

        member.stream() // a stream does not sort the original list - 
                        //only the items in the stream are sorted. ( The stream is sorted )
            .sorted()
            .forEach( m -> System.out.println(m));
        
        System.out.println();

        member.stream()
            .forEach( m->System.out.println(m));
        
        System.out.println();
        
        //Sorting a list with the sort method in the Collections class
        Collections.sort(member);
        member.stream()
            .forEach( m -> System.out.println(m));
        
    }
}