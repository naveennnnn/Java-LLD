package Adapter;
/*
 * 
 * OWNED BY YES BANK
 */
public class YESBANK {

    public double ShowBalance(String account){
        System.out.println("Fetching balance from YES BANK for account: "+account);

        return 10000.0;
    }

    public void sendFunds(String account, double amount){
        System.out.println("Transferring "+amount+" to account "+account+" using YES BANK");
    }
}