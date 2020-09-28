package snackbar;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ////////////////////////
        //      CUSTOMERS     //
        ////////////////////////
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);
        ///////////////////////////////
        //      VENDING MACHINES     //
        ///////////////////////////////
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        /////////////////////
        //      SNACKS     //
        /////////////////////
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack("Chocolate", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());
    
        // Customer 1 cash on hand $37.75
        // Quantity of snack 4 is 21
        c1.buySnack(soda.buySnack(3));
        cashOnHand(c1);
        quantityOfSnack(soda);
        System.out.println();

        // Customer 1 cash on hand $35.75
        // Quanity of snack 3 is 29
        c1.buySnack(pretzel.buySnack(1));
        cashOnHand(c1);
        quantityOfSnack(pretzel);
        System.out.println();

        // Customer 2 cash on hand $28.14
        // Quantity of snack 4 is 19    
        c2.buySnack(soda.buySnack(2));
        cashOnHand(c2);
        quantityOfSnack(soda);
        System.out.println();

        // Customer 1 cash on hand $45.75
        c1.addCash(10);
        cashOnHand(c1);
        System.out.println();

        // Customer 1 cash on hand $44.75
        // Quantity of snack 2 is 35
        c1.buySnack(chocolate.buySnack(1));
        cashOnHand(c1);
        quantityOfSnack(chocolate);
        System.out.println();

        // Quantity of snack 3 is 41
        pretzel.addSnack(12);
        quantityOfSnack(pretzel);
        System.out.println();

        // customer 2 cash on hand $22.14
        // Quantity of snack 3 is 38
        c2.buySnack(pretzel.buySnack(3));
        cashOnHand(c2);
        quantityOfSnack(pretzel);
        System.out.println();

        // Stretch Goals
        System.out.println("*** Stretch Goals ***");

        // Snack: Chips
        // Vending Machine: Food
        // Quantity: 36
        // Total Cost: $63.00
        System.out.println("Snack: " + chips.getSnackName());
        System.out.println("Vending Machine: " + food.getVendingName());
        quantityOfSnack(chips);
        System.out.println("Total Cost: " + chips.getSnackCost(36));
        System.out.println();

        // Snack: Chocolate Bar
        // Vending Machine: Food
        // Quantity: 35
        // Total Cost: $35.00
        System.out.println("Snack: " + chocolate.getSnackName());
        System.out.println("Vending Machine: " + food.getVendingName());
        quantityOfSnack(chocolate);
        System.out.println("Total Cost: " + chocolate.getSnackCost(35));
        System.out.println();

        // Snack: Pretzel
        // Vending Machine: Food
        // Quantity: 38
        // Total Cost: $76.00
        System.out.println("Snack: " + pretzel.getSnackName());
        System.out.println("Vending Machine: " + food.getVendingName());
        quantityOfSnack(pretzel);
        System.out.println("Total Cost: " + pretzel.getSnackCost(38));
        System.out.println();

        // Snack: Soda
        // Vending Machine: Drink
        // Quantity: 19
        // Total Cost: $47.50
        System.out.println("Snack: " + soda.getSnackName());
        System.out.println("Vending Machine: " + drink.getVendingName());
        quantityOfSnack(soda);
        System.out.println("Total Cost: " + soda.getSnackCost(19));
        System.out.println();

        // Snack: Water
        // Vending Machine: Drink
        // Quantity: 20
        // Total Cost: $55.00
        System.out.println("Snack: " + water.getSnackName());
        System.out.println("Vending Machine: " + drink.getVendingName());
        quantityOfSnack(water);
        System.out.println("Total Cost: " + water.getSnackCost(20));

    }

    public static void cashOnHand(Customer obj)
    {
        System.out.println("Customer " + obj.getCustId() + " cash on hand " + obj.getCustCash());
    }

    public static void quantityOfSnack(Snack obj)
    {
        System.out.println("Quantity of snack " + obj.getId() + " is " + obj.getSnackCount());
    }

}