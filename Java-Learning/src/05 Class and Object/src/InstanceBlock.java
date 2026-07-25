class SuperCar
{
    static
    {
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    SuperCar()
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

        SuperCar c1 = new SuperCar();
        c1.show();

        SuperCar c2 = new SuperCar();
        c2.show();
    }
}