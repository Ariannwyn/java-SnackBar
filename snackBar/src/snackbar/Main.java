package snackbar;

public class Main 
{
    private static void workWithData() 
    {
        System.out.println("Hello world");

        ////////////////////////
        //      VARIABLES     //
        ////////////////////////
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack("Chocolate", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());
    
        System.out.println(c1);
        c1.setCustCash(c1.getCustCash() + 10.00);
        System.out.println(c1.getCustName() + " " + c1.getCustCash());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}
