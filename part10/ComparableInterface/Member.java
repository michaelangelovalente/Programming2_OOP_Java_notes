public class Member implements Comparable<Member>{
    private String name;
    private int height;

    public Member(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return this.height;
    }

    @Override
    public String toString(){
        return this.getName() + " (" + this.getHeight() + ") ";
    }
    /* 
    @Override
    public int compareTo(Member member){
        if( this.height == member.getHeight()){
            return 0;
        }else if( this.height > member.getHeight()){
            return 1;
        }else{
            return -1;
        }
    }

    If we consider that returning a negative number is enough if the 'this'
    object is smaller.
    While 0 works if the lengths are the same
    And 1 if the the this object is greater.

    A better way to implement it is:
    */
    @Override
    public int compareTo(Member member){
        return this.height - member.getHeight();
    }
    
}
