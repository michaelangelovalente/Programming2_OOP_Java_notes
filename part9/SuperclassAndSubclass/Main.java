public class Main{
    public static void main(String args[]){
        Superclass sup = new Superclass();
        Subclass sub = new Subclass();
        Superclass sup2 = new Superclass("Testing superclass");

        System.out.println(sup.toString());
        System.out.println(sub.toString());
        System.out.println(sup2.toString());
    }
}