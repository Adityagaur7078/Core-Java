class Mackbook
{
    static
    {
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    Mackbook()
    {
        System.out.println("Constructor Executed");
    }

    void showDetails()
    {
        System.out.println("Mackbook Object Ready\n");
    }
}

public class CodeBlocks{
    public static void main(String[] args) {
        System.out.println("Main Method Started\n");

        Mackbook l1 = new Mackbook();

        l1.showDetails();

        Mackbook l2 = new Mackbook();

        l2.showDetails();
    }
}