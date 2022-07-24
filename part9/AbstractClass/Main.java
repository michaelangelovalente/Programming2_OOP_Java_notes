import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        PlusOperation plus = new PlusOperation();
        Scanner scan = new Scanner(System.in);
        plus.execute(scan);
    }
}