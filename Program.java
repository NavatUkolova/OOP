package OOP;

public class Program{
    public static void main(String[] args) {

        //Vehicle myVehicle = new Vehicle();

        Car myCar = new Car ("Red","Volga", 4, 17000, 180);
        Truck myTruck = new Truck("Black", "Kamaz", 8,  25000,  90);
        Motorcycle myMotorcycle = new Motorcycle( "Red", "Java", 2, 250, 250);
        Bicycle mBicycle = new Bicycle("Green", "Kama", 3, 8, 10);

        printVehicleInfo(myCar);
        printVehicleInfo(myTruck);
        printVehicleInfo(myMotorcycle);
        printVehicleInfo(mBicycle);
        //printVehicleInfo(myVehicle);
    }

    private static void printVehicleInfo(Vehicle myVehicle){
        System.out.println(myVehicle.getClass().getName() + "\n Параметры Т/С:\n Цвет:" + myVehicle.getColor() +
        "\n Модель:" + myVehicle.getModels() + "\n Количество колес:" + myVehicle.getWheels() + 
        "\n Вес:" + myVehicle.getWeight() + "\n Cкорость:" + myVehicle.getSpeed());
         myVehicle.ride();
    }
}