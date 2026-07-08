class Employee{
    String name;
    String department;
    double salary;

    void work(){
        System.out.println(name + " is Working in " + department + " department");
    }

    void receiveSalary(){
        System.out.println(name + " received ₹" + salary + " salary\n");
    }
}


public class InstanceMethods{
    public static void main(String[] args) {
        Employee hitesh = new Employee();
        Employee piyush = new Employee();
        Employee harsh = new Employee();

        hitesh.name = "Hitesh";
        hitesh.department = "Engineering";
        hitesh.salary = 70000;

        piyush.name = "Piyush";
        piyush.department = "Technical";
        piyush.salary = 50000;

        harsh.name = "Harsh";
        harsh.department = "cyber Security";
        harsh.salary = 65000;

        hitesh.work();
        hitesh.receiveSalary();

        piyush.work();
        piyush.receiveSalary();

        harsh.work();
        harsh.receiveSalary();
    }
}