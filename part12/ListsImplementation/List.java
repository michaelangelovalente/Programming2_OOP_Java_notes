public class List<Type>{

    private Type[] values;
    private int firstFreeIndex;

    public List(){
        this.values = (Type[]) new Object[10]; // You first create the array of type Object, then you cast it, this is because Java does not support the operation --> new Type[10] 
        //In the beginning every element contains a null reference.
        this.firstFreeIndex = 0;
    }

    public void add(Type value){
        if( this.firstFreeIndex == this.values.length ){
            grow();
        }
        this.values[firstFreeIndex++] = value;
    }

    private void grow(){
        int newSize = this.values.length + this.values.length/2;
        Type[] newValues = (Type[]) new Object[newSize];
        for( int i = 0 ; i < this.values.length; i++ ){
            newValues[i] = this.values[i];
        }

        this.values  = newValues;
    }

    /*
    public boolean contains(Type value){
        //we take advante of the fact that every object in java
        // Inherits the object type, which contains the .equals( Object object ) method
        for( int i = 0; i < this.firstFreeIndex; i++ ){
            if( values[i].equals(value)) return true;
        }
        return false;
    } */
    //Now that we have access to indexOfValue(), we can use it for the method contains
    public boolean contains(Type value ){
        return indexOfValue(value) >= 0;
    }

    public void remove(Type value){
        int indexOfValue = indexOfValue(value);
        if( indexOfValue < 0 ) return;
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public int indexOfValue(Type value){
        for( int i = 0; i < this.firstFreeIndex; i++){
            if( this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }


    private void moveToTheLeft(int fromIndex){
        for( int i = fromIndex; i < this.firstFreeIndex-1; i++){
            this.values[i] = this.values[i+1];
        }
    }

    public Type value(int index){
        if( index < 0 || index >= this.firstFreeIndex ){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]" );
        }
        return this.values[index];
    }


    public int size(){
        return this.firstFreeIndex;
    }

    // public void add(K key, V value){
    //     int hashValue = Math.abs(key.hashCode()%values.length);
    //     if( values[hashValue] == null ){
    //         values[hashValue] = new List<>();
    //     }
        
    //     List<Pair<K,V>> valuesAtIndex = values[hashValue];
    //     int index = -1;
    //     for( int i = 0; i< valuesAtIndex.size(); i++ ){
    //         if(valuesAtIndex.value(i).getKey().equals(key)){
    //             index = i;
    //             break;
    //         }    
    //     }
        
    //     if(index < 0){
    //         // no Pair<key,value) at that index of the array --> add a new Element to the arrayList
    //         valuesAtIndex.add(new Pair<>(key, value));
    //         this.firstFreeIndex++;
    //     }else{
    //         valuesAtIndex.value(index).setValue(value);
    //     }
    // }

    private List<Pair<K,V>> getListBasedOnKey(K key){
        int hashValue = Math.abs(key.hashCode()%values.length);
        if( values[hashValue] == null){
            values[hashValue] = new List<>();
        }

        return values[hashValue];
    }


    private int getIndexOfKey(List<Pair<K,V>> myList, K key){
        for( int i = 0; i < myList.size(); i++){
            if( myList.get(i).getKey().equals(key)){
                return i;
            }
        }

        return -1;
    }

    public void add(K key, V value){
        List<Pair<K,V>> valuesAtIndex = this.getListBasedOnKey(key);
        int index = this.getIndexOfKey(list, key);
        if( index < 0 ){
            valuesAtIndex.add( new Pair<>(key, value));
            this.firstFreeIndex++;
        }else{
           valuesAtIndex.value(index).setValue(value);
        }
    }

}