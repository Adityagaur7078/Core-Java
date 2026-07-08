class Human
{
    String name;

    Human(String name)
    {
        this.name = name;
    }

    void showDetails()
    {
        System.out.println("Human : " + name);
    }
}

public class GarbageCollection
{
    public static void main(String[] args)
    {
        Human s1 = new Human("Krish");

        s1.showDetails();

        // Remove the reference
        s1 = null;

        System.out.println("Reference removed");

        // Request JVM for Garbage Collection
        System.gc();

        System.out.println("Program Finished");
    }
}