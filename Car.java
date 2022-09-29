package OOP;

public class Car extends Vehicle{
    public Car (String color, String models, Integer wheels, Integer weight, Integer speed){
        this.color = color;
        this.models = models;
        this.wheels = wheels;
        this.weight = weight;
        this.speed = speed; 
    }
    @Override
    public void ride(){
       System.out.println("DDdrrrr");
     }
}
