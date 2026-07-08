class Crew
{
    // Instance Variable
    String name;

    // Static Variable
    static String company = "Google";

    void display()
    {
        // Local Variable
        int experience = 5;

        System.out.println("Name : " + name);
        System.out.println("Company : " + company);
        System.out.println("Experience : " + experience + " Years");
    }
}

public class VariableScope {
    public static void main(String[] args) {
        Crew e1 = new Crew();
        Crew e2 = new Crew();

        e1.name = "Aditya";
        e2.name = "Lucky";

        Crew.company = "Microsoft";

        e1.display();
        e2.display();
    }
}