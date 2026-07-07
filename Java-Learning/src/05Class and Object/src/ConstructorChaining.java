class Scholor
{
    private String name;
    private int age;
    private String course;

    Scholor(String name){
        this(name, 0, "Not Assigned");
    }

    Scholor(String name,int age){
        this(name, age, "Not Assigned");
    }

    Scholor(String name,int age,String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void showDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
    }
}

public class ConstructorChaining{
    public static void main(String[] args) {
        Scholor s1 = new Scholor("Aditya");

        Scholor s2 = new Scholor("Lucky",19);

        Scholor s3 = new Scholor("Harsh",20,"BCA");

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}