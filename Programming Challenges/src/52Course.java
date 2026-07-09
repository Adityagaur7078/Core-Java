class Course {
    static int maxCapacity = 100;

    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " enrolled successfully.");
        } else {
            System.out.println("Course is full.");
        }
    }

    void unenrollStudent(String studentName) {
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {

                // Shift remaining students
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }

                enrolledStudents[enrollments - 1] = null;
                enrollments--;

                System.out.println(studentName + " removed successfully.");
                return;
            }
        }

        System.out.println(studentName + " not found.");
    }

    void displayStudents() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Total Enrollments: " + enrollments);

        for (int i = 0; i < enrollments; i++) {
            System.out.println((i + 1) + ". " + enrolledStudents[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {

        // Set maximum capacity
        Course.setMaxCapacity(5);

        // Create course
        Course course = new Course("Java Programming");

        // Enroll students
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");
        course.enrollStudent("Charlie");

        // Display students
        course.displayStudents();

        // Remove a student
        course.unenrollStudent("Bob");

        // Display students again
        course.displayStudents();
    }
}