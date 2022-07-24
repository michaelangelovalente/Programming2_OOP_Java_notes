import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println(set.size());
        for( String string : set ){
            System.out.println(string);
        }
    }
}