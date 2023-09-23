
//public class GenericList<T extends Number>{ // <E> used for collections --> Elements (aka many ELEMENTS)
    //T can only be any of the Number class or its child classes
    //private T[] items = new T[10];
                        //T is now a bounded type parameter
public class GenericList<T extends Comparable & Cloneable>{ // Comparable Interface --> used to implement classes that can be compared with each other  
    private T[] items = (T[])new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}