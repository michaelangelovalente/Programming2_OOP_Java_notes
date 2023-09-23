import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        Person ollie = new Student("Ollie", " 6381 Hollywood");
        Student ollie2 = (Student)ollie;
        ollie2.credits();
        ((Student) ollie).credits();
        System.out.println(ollie);
        System.out.println(ollie2);

    }

    public static void printPersons(ArrayList<Person> persons){
        for( Person person: persons ){
            System.out.println(person);
        }
        return;
    }
}