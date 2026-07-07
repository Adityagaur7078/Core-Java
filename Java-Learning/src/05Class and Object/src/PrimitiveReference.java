class Person
{
    String name;

    void showName()
    {
        System.out.println("Person Name : " + name);
    }
}

public class PrimitiveReference {
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.name = "Aditya";

        Person s2 = s1;

        System.out.println("\nBefore Change");
        s1.showName();
        s2.showName();

        s2.name = "Lucky";

        System.out.println("\nAfter Change");
        s1.showName();
        s2.showName();
    }
}