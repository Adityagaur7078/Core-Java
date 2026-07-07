class Children
{
    String name;
    int age;

    void showDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class StackHeapDemo
{
    static void updateChildren(Children s)
    {
        s.name = "Lucky";
        s.age = 20;

        System.out.println("\nInside updateChildren()");
        s.showDetails();
    }

    public static void main(String[] args)
    {
        Children s1 = new Children();

        s1.name = "Aditya";
        s1.age = 18;

        System.out.println("Before Method Call");
        s1.showDetails();

        updateChildren(s1);

        System.out.println("\nAfter Method Call");
        s1.showDetails();
    }
}