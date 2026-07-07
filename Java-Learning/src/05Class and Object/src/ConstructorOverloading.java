class Learner
{
    private String name;
    private int age;
    private String course;

    Learner(String name){
        this.name = name;
        course = "Not Assigned";
    }

    Learner(String name, int age){
        this.name = name;
        this.age = age;
        course = "Not Assigned";
    }

    Learner(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
    }
}


public class ConstructorOverloading{
    public static void main(String[] args) {
        Learner s1 = new Learner("Aditya");

        Learner s2 = new Learner("Lucky",19);

        Learner s3 = new Learner("Harsh",20,"BCA");

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}