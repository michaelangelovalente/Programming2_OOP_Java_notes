import javax.swing.plaf.multi.MultiTableHeaderUI;

public class Main{
    public static void main(String[] args){
        
        for(int i = 0; i < 5; i++){
           MultithreadThing multi = new MultithreadThing(i);
           Thread myThread = new Thread(multi);
           myThread.start();
           //myThread.join() / mythread.isAlive()
           
        }
        

    }
}