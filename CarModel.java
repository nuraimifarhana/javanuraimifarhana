//Create a new private and public class that can get the cars model,
//make and price and portray it in the terminal

public class CarModel {
    private String model;
    private String country;
    private long price; 

    public CarModel(String model, String country, long price){
        this.model = model;
        this.country = country;
        this.price = price;
}
public void displayDetails(){
    String modelShow = "Car Model: ";
    String countryShow = "Country: ";
    String priceShow ="Price: ";
    System.out.println(modelShow + model);
    System.out.println(countryShow + country);
    System.out.println(priceShow + price);
}
public static void main(String[]args){
    CarModel cm = new CarModel("Toyota Yaris","Japan",90000);
    cm.displayDetails();
}
}