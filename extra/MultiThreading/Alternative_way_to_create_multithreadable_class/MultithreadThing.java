public class MultithreadThing implements Runnable{ // when you implement runnable you have to implement your own run method.
    /**
     * This is useful because in java when a class extends a class you cannot extend any other class
     * Java does not allow a class to be a subclass of multiple class.
     * public class MultithreadThing extends Anyclass implements Runnable
     */
    private int threadNumber;
    public MultithreadThing(int threadNumber ){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for( int i = 1; i <= 5; i++ ){
            System.out.println(i + " from thread: " + this.threadNumber);
            /*if( threadNumber == 3){
                throw new RuntimeException();
            }*/
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            
        }
    }

}