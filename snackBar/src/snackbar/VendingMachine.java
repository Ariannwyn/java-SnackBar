package snackbar;

public class VendingMachine
{    
        /////////////////////
        //      FIELDS     //
        /////////////////////
    private static int maxId = 0;
    private String vendingName;
    private int id;

        //////////////////////////
        //      CONSTRUCTOR     //
        //////////////////////////
    public VendingMachine(String vendingName){
        maxId++;
        id = maxId;
        this.vendingName = vendingName;
    }

        //////////////////////
        //      GETTERS     //
        //////////////////////
    public String getVendingName(){
        return vendingName;
    }

    public int getId(){
        return id;
    }

    public int getMaxId(){
        return maxId;
    }

        //////////////////////
        //      SETTERS     //
        //////////////////////
    public void setVendingName(String vendingName){
        this.vendingName = vendingName;
    }
}
