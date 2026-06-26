public class LogicalOperators {
    public static void main(String[] args) {

        int age = 20;
        String gender = "Female";
        boolean student = true;

        // AND (&&)
        if (age >= 18 && student) {
            System.out.println("You get Student Discount.");
        }

        // OR (||)
        if (age < 18 || gender.equals("Female")) {
            System.out.println("You get Special Discount.");
        }

        // NOT (!)
        if (!student) {
            System.out.println("No Student Discount.");
        } else {
            System.out.println("Student Discount Available.");
        }
    }
}