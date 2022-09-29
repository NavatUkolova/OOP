package OOP;

public class Vehicle {
    protected String color;
    protected String models;
    protected Integer wheels;
    protected Integer weight;
    protected Integer speed;

    public void ride(){
        System.out.println("haha");
    }
    
    public String getColor(){
        return color;
    }
    public String getModels(){
        return models;
    }
    public Integer getWheels(){
        return wheels;
    }        
    public Integer getWeight(){
        return weight;
    }
    public Integer getSpeed(){
        return speed;
    }    
}
