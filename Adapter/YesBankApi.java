package Adapter;
/*
 * Owned by PhonePe  -- THis is the adapter
 */
public class YesBankApi implements BankApi{
    YESBANK yesbank;
    public YesBankApi(){
        yesbank = new YESBANK();
    }
    @Override
    public void sendMoney(String acc, double money) {
        System.out.println("Sending "+money+" to account "+acc+" using Yes Bank API");
        //Other HDFC 3rd party api interactions
        yesbank.sendFunds(acc,money);
    }
    @Override
    public double getBalance(String acc) {
        System.out.println("Getting balance for account "+acc+" using Yes Bank API");
        //Other HDFC 3rd party api interactions
        return yesbank.ShowBalance(acc);
    }
}
