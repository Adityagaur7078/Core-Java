class Student{
    String name;
    int age;

    void printStudentDetails(){
        System.out.println(name + " is " + age + " year old");
    }
}

public class ClassVSObject{
    public static void main(String[] args) {
        Student aditya = new Student();
        aditya.name = "Aditya";
        aditya.age = 18;

        Student lucky = new Student();
        lucky.name = "Lucky";
        lucky.age = 19;

        Student adi = new Student();

        adi.name = "Adi";
        adi.age = 13;

        aditya.printStudentDetails();
        lucky.printStudentDetails();
        adi.printStudentDetails();

    }

}