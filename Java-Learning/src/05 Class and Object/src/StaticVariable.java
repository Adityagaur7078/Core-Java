class CollegeStudent{
    String name;
    int rollNo;

    static String collegeName;

    CollegeStudent(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void showDetails(){
        System.out.println("Name : " + name + "\n"
        + "Roll No : " + rollNo + "\n"
        + "College : " + collegeName + "\n");
    }
}

public class StaticVariable{
    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent("Hitesh", 1);
        CollegeStudent s2 = new CollegeStudent("Piyush", 2);
        CollegeStudent s3 = new CollegeStudent("Harsh", 3);

        CollegeStudent.collegeName = "ABC College";

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}