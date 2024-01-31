import java.util.Scanner;
public class Bakery {
    public static void main(String[] args) {
        //variable declaration
        Scanner userInput = new Scanner(System.in);
        String name;
        String type;
        double pricePerDozen;
        int quantity;
        double totalPrice;

        //input
        System.out.println("Cookies");
        System.out.println(" (s)ugar - $5.99 / dz");
        System.out.println("(c)hocolate Chip - $7.99 / dz");
        System.out.println("Please choose a type of cookies: ");
        type = userInput.nextLine();
        System.out.println();

        System.out.print("How many dozen do you want");
        quantity = Integer.parseInt(userInput.nextLine().strip());

        System.out.print("what name can I put this order under? ");
        name = userInput.nextLine();
        //work
        if (type.equalsIgnoreCase("s"))
        {
            pricePerDozen = 5.99;
        }else {
            pricePerDozen = 7.99;
        }

        //output
        System.out.println("Order for " + name);
        System.out.println(type);
        System.out.println(quantity);
    }
}
