package snackbar;

public class Snack
{
        /////////////////////
        //      FIELDS     //
        /////////////////////
    private int id;
    private static int maxId = 0;
    private String snackName;
    private double snackCost;
    private int vendingId;
    private int snackCount;

        //////////////////////////
        //      CONSTRUCTOR     //
        //////////////////////////
    public Snack(String snackName, int snackCount, double snackCost, int vendingId){
        maxId++;
        id = maxId;
        this.snackName = snackName;
        this.snackCount = snackCount;
        this.snackCost = snackCost;
        this.vendingId = vendingId;
    }
   
        //////////////////////
        //      GETTERS     //
        //////////////////////
    public int getId(){
        return id;
    }

    public int getMaxId(){
        return maxId;
    }

    public String getSnackName(){
        return snackName;
    }

    public double getSnackCost(){
        return snackCost;
    }

    public int getSnackCount(){
        return snackCount;
    }

    public int getVendingId(){
        return vendingId;
    }

        //////////////////////
        //      SETTERS     //
        //////////////////////
    public void setSnackName(String snackName){
        this.snackName = snackName;
    }

    public void setSnackCost(double snackCost){
        this.snackCost = snackCost;
    }

    public void setSnackCount(int snackCount){
        this.snackCount = snackCount;
    }

}

// get quantity
// add quantity when given how many to add
// buy snack when given how many to buy
// get total cost given a quantity