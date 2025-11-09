package Adapter;

public class Client {
    public static void main(String[] args) {
        HDFCBankApi bank = new HDFCBankApi();
        // YesBankApi bank = new YesBankApi();
        PhonePe phonePe = new PhonePe(bank);
        phonePe.transferMoney("12345", 5000);
        double balance = phonePe.checkBalance("12345");
        System.out.println("Balance: "+balance);

    }
}
