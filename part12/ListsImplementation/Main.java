public class Main{
    public static void main(String[] args){
        

        /*
        List<String> myList = new List<>();
        for( int i = 0 ; i < 12; i++ ){
            newList.add("Hello");
        }
         */

        /*
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
         
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
        */

        // List<String> myList = new List<>();

        // System.out.println(myList.contains("hello"));
        // myList.add("hello");

        // System.out.println(myList.contains("hello"));
        // int index = myList.indexOfValue("hello");
        // System.out.println(index);
        // System.out.println(myList.value(index));
        // myList.remove("hello");
        // System.out.println(myList.contains("hello"));

        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");
        
        for( int i = 0; i < myList.size(); i++){
            // System.out.printf("[%d] ", myList.value(i) );
            System.out.println(myList.value(i) + " ");
        }

        

    }
}