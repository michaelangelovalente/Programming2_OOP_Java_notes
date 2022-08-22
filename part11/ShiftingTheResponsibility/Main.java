
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main{

    public static void main(String args[]) throws Exception {

        List<String> test = readLines(args[0]);
        System.out.println("------Reading file-----");
        for( String line : test ){
            System.out.println("> " + line);
        };
    }
    /*
    public static void main(String args[]){

        List<String> test;
        try{

            test = readLines(args[0]);
            System.out.println("------Reading file-----");
            for( String line : test ){
                System.out.println("> " + line);
            }

        }catch(Exception e){
            System.out.println("Error while reading file: "  + e.getMessage());
        }
        
        
    }
     */
    /*
    public static void main(String args[]){
        List<String> test = readLines(args[0]);
        System.out.println("------Reading file-----");
        for( String line : test ){
            System.out.println("> " + line);
        }
    }

    public static List<String> readLines(String fileName){

        List<String> lines = new ArrayList<>();

        try{
            Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
        }catch(Exception e){
            System.out.println("Error with file: " + e.getMessage());
        }
        return lines;
    }
     */

     public static List<String> readLines(String fileName ) throws Exception {
        ArrayList<String> lines = new ArrayList<>();
        Files.lines( Paths.get(fileName)).forEach(line -> lines.add(line));
        return lines;
     }

}