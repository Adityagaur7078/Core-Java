class Laptop{
    String brand;
    int ram;
    double price;

    Laptop(String brand, int ram, double price)
    {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void showDetails(){
        System.out.println("Brand new " + brand + " Laptop with RAM " + ram + "gb for selling at Price: ₹" + price);
    }
}

public class ThisKeyword{
    public static void main(String[] args) {

        Laptop hp = new Laptop("HP", 16, 65000);

        Laptop dell = new Laptop("Dell", 32, 85000);

        Laptop lenovo = new Laptop("Lenovo", 8, 45000);

        hp.showDetails();
        dell.showDetails();
        lenovo.showDetails();

    }
}