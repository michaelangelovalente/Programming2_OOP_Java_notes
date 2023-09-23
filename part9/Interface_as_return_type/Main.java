public class Main{
    public static void main(String[] args){
        Packer packer = new Packer();
        Box box_test = packer.giveABoxOfThings();
        System.out.println(box_test);
    }
}