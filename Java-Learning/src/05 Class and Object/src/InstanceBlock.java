class Car
{
    static
    {
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    Car()
    {
        System.out.println("Constructor Executed");
    }

    void show()
    {
        System.out.println("Car Ready\n");
    }
}

public class InstanceBlock
{
    public static void main(String[] args)
    {
        System.out.println("Main Method Executed\n");

        Car c1 = new Car();
        c1.show();

        Car c2 = new Car();
        c2.show();
    }
}