public class Pair<T,K>{ // there is no maximum of type parameters.

    private T first;
    private K second;

    public void setValues(T first, K second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }


    public K getSecond(){
        return this.second;
    }

}