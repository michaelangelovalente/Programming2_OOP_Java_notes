public class Locker<T>{ //Locker<T> indicates that the Locker class must be given a type parameter in its constructor.

    private T element;

    public void setValue(T element){
        this.element = element;
    }

    public T getValue(){
        return element;
    }

}
//During runtime T will be replaced with whatever type it has been given.