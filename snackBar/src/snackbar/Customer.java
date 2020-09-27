package snackbar;

public class Customer
{
        /////////////////////
        //      FIELDS     //
        /////////////////////
    private int custId;
    private static int custMaxId = 0;
    private String custName;
    private double custCash;
    
        //////////////////////////
        //      CONSTRUCTOR     //
        //////////////////////////
    public Customer(String custName, double custCash){
        custMaxId++;
        custId = custMaxId;
        this.custName = custName;
        this.custCash = custCash;
    }

        //////////////////////
        //      GETTERS     //
        //////////////////////
    public int getCustId(){
        return custId;
    }

    public int getCustMaxId(){
        return custMaxId;
    }

    public String getCustName(){
        return custName;
    }

    public double getCustCash(){
        return custCash;
    }

        //////////////////////
        //      SETTERS     //
        //////////////////////
    public void setCustName(String custName){
        this.custName = custName;
    }

    public void setCustCash(double custCash){
        this.custCash = custCash;
    }

    // @Override
    // public String toString(){
    //     String rtnStr + "Customer name: " + custName + " cash: " + custCash;
    //     return rtnStr;
    // }
}

    // add cash to cash on hand
    // get cash on hand
    // buy snacks. Given the total 
        // cost of the snacks to be purchased, 
        // reduce the cash on hand by that amount