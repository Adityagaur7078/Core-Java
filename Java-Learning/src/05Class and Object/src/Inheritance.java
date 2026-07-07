class Vehicle
{
    String brand;
    int speed;

    void start()
    {
        System.out.println("Vehicle Started");
    }

    void showVehicleDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }
}

class Bike extends Vehicle
{
    String fuelType;

    void showBikeDetails()
    {
        System.out.println("Fuel Type : " + fuelType);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.brand = "Honda";
        bike.speed = 180;
        bike.fuelType = "Petrol";

        bike.start();

        bike.showVehicleDetails();

        bike.showBikeDetails();
    }
}

