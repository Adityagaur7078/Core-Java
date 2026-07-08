class Tablet
{
    String brand;
    String model;
    double price;

    void showDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class CreatingObjects{
    public static void main(String[] args) {
        Tablet p1 = new Tablet();
        Tablet p2 = new Tablet();
        Tablet p3 = new Tablet();
        Tablet p4 = p1;

        p1.brand = "Samsung";
        p1.model = "Galaxy Tab S10";
        p1.price = 65000;

        p2.brand = "Nokia";
        p2.model = "T20";
        p2.price = 25000;

        p3.brand = "Nova";
        p3.model = "Pad X";
        p3.price = 18000;


        p4.brand = "Vivo";

        p1.showDetails();
        p2.showDetails();
        p3.showDetails();
        p4.showDetails();
    }
}