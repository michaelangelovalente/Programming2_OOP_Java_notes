public class Person{
    private String name;
    private int age;

    public Person(String initialName){
        this.name = initialName;
        this.age = 0;
    }

    public void printPerson(){
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public String getName(){
        return this.name;
    }

}


//https://yuml.me/michaelangelovalente/diagram/scruffy/class/draw