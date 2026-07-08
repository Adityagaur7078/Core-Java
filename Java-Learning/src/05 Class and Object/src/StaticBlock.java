class Phone
{
    static String company;

    static
    {
        System.out.println("Static Block Executed");

        company = "Samsung";
    }

    Phone()
    {
        System.out.println("Constructor Executed");
    }

    void showDetails()
    {
        System.out.println("Company : " + company);
    }
}

public class StaticBlock
{
    public static void main(String[] args)
    {
        System.out.println("Main Method Executed");

        Phone m1 = new Phone();
        Phone m2 = new Phone();

        m1.showDetails();
        m2.showDetails();
    }
}