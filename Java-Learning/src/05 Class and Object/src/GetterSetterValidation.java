class Worker
{
    private String name;
    private double salary;

    Worker(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    String getName(){
        return name;
    }

    double getSalary(){
        return salary;
    }

    void setName(String name){
        this.name = name;
    }

    void setSalary(double salary){
        if(salary >= 0){
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    void showDetails(){
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}


public class GetterSetterValidation{
    public static void main(String[] args) {
        Worker emp = new Worker("Aditya", 50000);

        emp.setSalary(70000);

        emp.showDetails();
    }
}