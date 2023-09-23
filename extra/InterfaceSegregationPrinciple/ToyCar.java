public class ToyCar implements Movable, Toy {
    
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
        System.out.println("ToyCar: Starts moving.");
    }

    @Override
    public String toString(){
        return "ToyCar: Moveable Toy car - Price: " + this.price + " color: " + this.color;
    }
}