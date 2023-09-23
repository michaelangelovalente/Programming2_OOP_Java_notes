
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        ArrayList<String> lines = new ArrayList<>();

        try(Scanner reader = new Scanner( new File("file.txt")) ){
            while( reader.hasNextLine()){
                lines.add(reader.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }


        for(String line : lines){
            System.out.println(line);
        }
    }
}