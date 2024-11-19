
import java.util.Scanner;


public class averageFirstAssignment {

    private String model;
    private String country;
    private double price;
    
    public void printDetails(){
        System.out.println("Car model: " + model + " made from " + country + " with price of " + price + "!"); 
    }

    public averageFirstAssignment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter car model:");
        this.model = scanner.nextLine();
        System.out.println("Please enter car make:");
        this.country = scanner.nextLine();
        System.out.println("Please enter car price:");
        this.price = scanner.nextDouble();
        System.out.println("Car Description");
        printDetails();

    }
    public static void main(String[] args) {        
        averageFirstAssignment firstcar = new averageFirstAssignment();
        averageFirstAssignment secondcar = new averageFirstAssignment();
        averageFirstAssignment thirdcar = new averageFirstAssignment();
        double average = (firstcar.price + secondcar.price + thirdcar.price)/3;
        System.out.println("The average price of the three cars is: " + average);

    }
}
