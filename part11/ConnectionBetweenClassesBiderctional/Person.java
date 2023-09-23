import java.util.ArrayList;

public class Person{
    private String name;
    private int age;
    private ArrayList<Book> book;

    

    public Person(String initialName){
        this.name = initialName;
    }

    public String printPerson(){
        return  name + ": " + age;
    }

    public String getName(){
        return name;
    }




}