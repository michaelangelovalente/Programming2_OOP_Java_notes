public class Printer{
    public void printManyTimes(Object object, int times){
        int i = 0;
        while( i < times){
            System.out.println(object.toString());
            i = i + 1;
        }

    }

    public void printCharacter( CharSequence charSequence){
        int i = 0;
        while( i < charSequence.length()){
            System.out.println( charSequence.charAt(i));
            i = i + 1;
        }
    }
    
}