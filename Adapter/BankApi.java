package Adapter;
/*
 * Owned by PhonePe
 */
public interface BankApi {
    void sendMoney(String acc,double mpney);
    double getBalance(String acc);
}
