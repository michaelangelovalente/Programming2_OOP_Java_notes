public class Main{
    public static void main(String[] args){
        /*
        var list = new List();
        list.add(1);
        list.add("1");
        list.add(new User());

        //int number = (int) list.get(0);//#endregion
        int number = (int)list.get(1); // ClassCastException --> Invalid cast!
         */
        /*var list = new GenericList<Integer>();
        list.add(1);
        int number = list.get(0);*/
        /*
        GenericList<User> list = new GenericList<>();
        list.add(new User());
        User usr = list.get(0);
         */
        //can Be Number --> or Integer, Float Double
        /* 
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // automatically wrapped in an istance of Integer --> Boxing
        int number = numbers.get(0); // returns Istance of Integer class; --> Unboxing
        */
        //Comparable examples that implements Comparable
        //new GenericList<Short>();
        //new GenericList<Integer>();
        //new GenericList<String>();

        // We cannot pass:
        //new GenericList<User>(); // This would be passable only if we implement in the User class the Comparable interface


        

    }
}