
import java.util.ArrayList;

public class GeneralList<T> implements List<T>{
    ArrayList<T> values;

    public GeneralList(){
        this.values = new ArrayList<>();
    }

    public void add(T value){
        this.values.add(value);
    }

    public T get(int index){
        return this.get(index);
    }

    public T remove(int index){

        T value = this.values.get(index);
        this.values.remove(index);
        return value;

    }

}