import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class InputOutput{

    public static void main(String[] args){
        /* Write
        try{
            BufferedWriter bw = new BufferedWriter( new FileWriter("/home/michaelangelovalente/Desktop/IO_test/output.txt") ); 
            //We need to pass in a file writer object to the constructor. The Filewriter takes the output path
            bw.write("You know the rules and so do i\n");
            bw.write("A full commitment's what I'm thinking of\n");
            bw.write("You wouldn't get this from any other guy\n");
            bw.write("\n");
            bw.write("I just wanna tell you how I'm feeling\nGotta make you understand\n\n");
            bw.write("Never gonna give you up \nNever gonna let you down\nNever gonna run around and desert you\nNever gonna make you cry\nNever gonna say goodbye\nNever gonna tell a lie and hurt you\n");
            bw.close();
        }catch( Exception e){
            return;
        }
        */
        /*
        Read
        try{
            BufferedReader br = new BufferedReader( new FileReader("/home/michaelangelovalente/Desktop/IO_test/output.txt"));
            String s;
            while( (s = br.readLine()) != null ){
                System.out.println(s);
            }
            br.close();
        }catch(Exception e){
            return;
        }
         */
        /**Read and Write --> Copy a file*/
        try{
            BufferedWriter bw = new BufferedWriter( new FileWriter("output-copy.txt"));

            BufferedReader br = new BufferedReader( new FileReader("/home/michaelangelovalente/Desktop/IO_test/output.txt") );
            String s = "";
            while( (s = br.readLine()) != null ){
                bw.write(s+"\n");
            }
            br.close();
            bw.close();
        }catch(Exception e){
            return;
        }
       
    }

}