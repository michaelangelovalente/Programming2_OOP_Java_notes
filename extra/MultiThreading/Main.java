import javax.swing.plaf.multi.MultiTableHeaderUI;

public class Main{
    public static void main(String[] args){
        /*
        MultithreadThing myThing = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();
        //myThing.run(); --> would work, but it won't do it on a seperate thread.

        //java will branch of a new threadand it will proceed, letting the thread run by its own.
        myThing.start();
        myThing2.start();
        
        //If we ran the run() method, it won't run multiple threads
        */
        /*
        // Example for creating multiple threads
        for( int i = 0; i < 5; i++ ){
            MultithreadThing multi = new MultithreadThing();
            multi.start();
        }
         */
        /*
         //numbered threads
         for( int i = 0; i < 3; i++){
            MultithreadThing multi = new MultithreadThing(i);
            multi.start();
         }
          */
         // Utility of threads: if for any reason one of the threads blows up, all of the 
         // threads will continue on executing

         //Example of thread with an excpetion
         /*
         for(int i = 0; i < 5; i++){
            MultithreadThing multi = new MultithreadThing(i);
            multi.start();
         }
          */
          //Example with runtime exception on main thread. ( Even though the main thread blew up, all the other threads kept on executing)
        for(int i = 0; i < 5; i++){
           MultithreadThing multi = new MultithreadThing(i);
           multi.start();
        }
        throw new RuntimeException();

    }
}