class Mobile{
    String brand;
    String model;
    int price;

    void showDetails(){
        System.out.println(brand + " " + model + " phone is for selling at price " + price);
    }

}

public class ProcessVSOOP {
    public static void main(String[] args) {
        Mobile one = new Mobile();
        one.brand = "Samsung";
        one.model = "S25";
        one.price = 4000;

        Mobile two = new Mobile();
        two.brand = "iphone";
        two.model = "17";
        two.price = 4000;

        one.showDetails();
        two.showDetails();
    }
}