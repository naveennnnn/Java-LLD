package Adapter;
/*
 * Owned by PhonePe  -- THis is the adapter
 */
public class HDFCBankApi implements BankApi{
    HDFC hdfc;
    public HDFCBankApi(){
        hdfc = new HDFC();
    }
    @Override
    public void sendMoney(String acc, double money) {
        System.out.println("Sending "+money+" to account "+acc+" using HDFC Bank API");
        //Other HDFC 3rd party api interactions
        hdfc.transferFunds(acc, money);
    }
    @Override
    public double getBalance(String acc) {
        System.out.println("Getting balance for account "+acc+" using HDFC Bank API");
        //Other HDFC 3rd party api interactions
        hdfc.fetchBalance(acc);
        return 10000.0;
    }
}
