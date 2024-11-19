//Create a new private and public classes that can get at least 3 cars, model, make and price from 
//the terminal, and then calculate the average prices of the cars and show it in the terminal.

import java.util.Scanner;
public class averagePublicCar {
    private String model1, country1, model2, country2, model3, country3;
    private long price1, price2, price3;

    
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Enter first car: ");
    String model1 = scanner.nextLine();
    System.out.println("Enter first car make: ");
    String country1 = scanner.nextLine();
    System.out.println("Enter first car price: ");
    long price1 = Long.parseLong(scanner.nextLine());
    System.out.println("First car: " + model1 + " made from " + country1 + " with price of " + price1 + "!"); 
    System.out.println("Enter second car: ");
    String model2 = scanner.nextLine();
    System.out.println("Enter second car make: ");
    String country2 = scanner.nextLine();
    System.out.println("Enter second car price: ");
    long price2 = Long.parseLong(scanner.nextLine());
    System.out.println("Second car: " + model2 + " made from " + country2 + " with price of " + price2 + "!");
    System.out.println("Enter third car: ");
    String model3 = scanner.nextLine();
    System.out.println("Enter third car make: ");
    String country3 = scanner.nextLine();
    System.out.println("Enter third car price: ");
    long price3 = Long.parseLong(scanner.nextLine());
    System.out.println("Third car: " + model3 + " made from " + country3 + " with price of " + price3 + "!");  
    long average = (price1 + price2 + price3) / 3;
        System.out.println("The average price of the three cars is: " + average);
        
      
}
}