public class ToyPlane implements Movable, Flyable, Toy{

    private double price;
    private String color;

    @Override
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void move(){
        System.out.println("ToyPlane: start moving plane.");
    }

    @Override
    public void fly(){
        System.out.println("ToyPlane: start flying plane.");
    }

    @Override
    public String toString(){
        return "ToyPlane: Movable and flyable toy plane - Price: " + this.price + " Color: " + this.color;
    }
    
}