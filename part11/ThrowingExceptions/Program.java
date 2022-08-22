public class Program{
    /*
    //The following code always throws an exception
    public static void main(String[] args){
        throw new NumberFormatException();
    }
     */

     public static void main(String[] args){
        Grade grade = new Grade(3);
        System.out.println(grade);

        Grade illegalGrade = new Grade(22);
        //exception. Exec will not continue from here.

     }
    
}