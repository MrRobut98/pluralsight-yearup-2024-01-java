package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
public class PizzeriaApplication
{
    userInput ui = new UserInput();
    public void run()
    {
        Scanner scanner = new Scanner(System.in);

        ui.displayHomeScreen(); ui: UserInput@792

        //Name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.println("Menu");
        System.out.println("-----------");

        //Sizes
        System.out.println("Pizza Sizes:");
        System.out.println(" (S)mall - $5.99");
        System.out.println(" (M)edium - $8.99");
        System.out.println(" (L)arge - $11.99");
        System.out.print("Select your pizza size:");
        String size = scanner.nextLine().strip();
        System.out.println();

        //Sauces
        System.out.println("Sauces:");
        System.out.println(" (T)omato");
        System.out.println(" (A)lfredo");
        System.out.println(" (B)bq");
        System.out.println("Select your sauce:");
        String sauce = scanner.nextLine().strip();
        System.out.println();

        //cheeses
        System.out.println("Cheeses");
        System.out.println(" (M)ozzarella");
        System.out.println(" (P)rovalone");
        System.out.println(" (C)heddar");
        System.out.println(" (A)merican");
        System.out.println("Select your cheese");
        String cheese = scanner.nextLine().strip();
        System.out.println();

    // toppings
        ArrayList<String> toppings = new ArrayList<>();

        System.out.println("Do you want to add a topping (y/n)? ");
        String addToppings = scanner.nextLine().strip();

        while (addToppings.equalsIgnoreCase("y"))
        {
            System.out.print("Enter a topping name ($1 per topping): ");
            String topping = scanner.nextLine().strip();
            toppings.add(topping);

            System.out.print("Do you want to add another topping (y/n)? ");
            addToppings = scanner.nextLine().strip();
        }

        //calculate price
        double basePrice = 5.99;
        sizeDisplay = "Small";
        if (size.equalsIgnoreCase("m"))
        {
            basePrice = 8.99;
            sizeDisplay = "Medium";
        } else if (size.equalsIgnoreCase("l")) {
            basePrice = 11.99;
            sizeDisplay = "Large";
        }
        double totalPrice = basePrice + toppings.size();

        //display values
        String sauceDisplay = "Tomato";

        if(sauce.equalsIgnoreCase("a")) sauceDisplay = "Alfredo";
        else if (sauce.equalsIgnoreCase("b")) sauceDisplay = "BBQ";

        String cheeseDisplay = "Mozzarella";

        if (cheese.equalsIgnoreCase("p")) cheeseDisplay = "Provolone";
        else if (cheese.equalsIgnoreCase("a")) cheeseDisplay = "American";
        else if(cheese.equalsIgnoreCase("c")) cheeseDisplay = "Cheddar";




        // display order
        System.out.println();
        System.out.println("Order Details: ");
        System.out.println("---------------------");
        System.out.println("Name: " + name);
        System.out.println("Price: $ %.2f \n ");
        System.out.println("Size: " + sizeDisplay);
        System.out.println("Sauce: " + sauceDisplay);
        System.out.println("Cheeses: " + cheeseDisplay);
        System.out.println("Toppings");
        for (String topping : toppings){
            System.out.println("  " + topping);
        }

    }
}













