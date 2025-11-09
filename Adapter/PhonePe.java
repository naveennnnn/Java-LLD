package Adapter;
/*
 * 
 * Owned BY PHONEPE
 */
public class PhonePe{
    BankApi bankApi;

    PhonePe(BankApi bankApi){
        this.bankApi = bankApi;
    }

    public void transferMoney(String acc, double money){
        bankApi.sendMoney(acc, money);
    }

    public double checkBalance(String acc){
        return bankApi.getBalance(acc);
    }
}