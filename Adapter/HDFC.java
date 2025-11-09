package Adapter;
/*
 * 
 * OWNED BY HDFC
 */
public class HDFC {
    public double fetchBalance(String account){
        System.out.println("Fetching balance from HDFC for account: "+account);

        return 10000.0;
    }

    public void transferFunds(String account, double amount){
        System.out.println("Transferring "+amount+" to account "+account+" using HDFC");
    }
}
