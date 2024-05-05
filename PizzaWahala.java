import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner crimson = new Scanner(System.in);

	System.out.println("Welcome To Iya Afeez Pizza Joint: ");

        System.out.print("\nEnter The Number Of Guests: ");

        int numberOfGuests = crimson.nextInt();

	crimson.nextLine();

        System.out.print("Enter the pizza size (Sapa, Small money, Big boys, Odogwu): ");

        String pizzaSize = crimson.nextLine();

        int slicesPerBox = 1;
        int pricePerBox = 1;

        if (pizzaSize.equalsIgnoreCase("sapa")) { 

            slicesPerBox = 4;
            pricePerBox = 2000;

        } else if (pizzaSize.equalsIgnoreCase("small money")) {

            slicesPerBox = 6;
            pricePerBox = 2400;

        } else if (pizzaSize.equalsIgnoreCase("big boys")) {

            slicesPerBox = 8;
            pricePerBox = 3000;

        } else if (pizzaSize.equalsIgnoreCase("odogwu")) {

            slicesPerBox = 12;
            pricePerBox = 4200;

        } else {

            System.out.println("Invalid!! Pizza Size Entered, Enter The Correct Size");

        }

        int boxesOfPizzaNeeded = numberOfGuests / slicesPerBox ; 

        int totalNumberSlices = boxesOfPizzaNeeded * slicesPerBox;

        int leftoverSlices = totalNumberSlices - numberOfGuests;

        int totalPrice = boxesOfPizzaNeeded * pricePerBox;

        System.out.println("Number of Boxes Of Pizza To Buy = " + boxesOfPizzaNeeded + " Boxes");

        System.out.println("Number Of Leftover Slices After Serving = " + leftoverSlices + " Slices");

        System.out.println("Price = " + totalPrice);

    }
}
