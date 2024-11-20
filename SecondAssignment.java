//Create a Switch which is going to obtain the car model from the terminal and give back the price, 
//if the price is greater than 100,000 RM shows the buyer is VIP.

import java.util.Scanner;

public class SecondAssignment{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the car model:");
        String carmodel  = scanner.nextLine();
        double price = 0.0;

        switch(carmodel){
            case "Perodua":
                price = 50000.00;
                break;
            case "Toyota":
                price = 90000.00;
                break;
            case "Mercedes":
                price = 120000.00;
                break;
            default:
            System.out.println("Unknown car model.");
        }
        System.out.println("The car model " + carmodel + " with the price of RM " + price);

        if (price > 100000){
            System.out.println("The buyer is VIP.");
        }
        else{
            System.out.println("The buyer is not VIP!");
        }
        
    }

}