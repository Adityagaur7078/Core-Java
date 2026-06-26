public class learningIfElse{
    public static void main(String[] args) {

        boolean isMale = true;
        String name = "Roshan";

        if (isMale) {
            System.out.println("Mr " + name);
        } else {
            System.out.println("Miss " + name);
        }

        int age = 26;

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age <= 2) {
            System.out.println("Infant");
        } else if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 35) {
            System.out.println("Young Adult");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else if (age <= 79) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Super Senior Citizen");
        }

    }
}