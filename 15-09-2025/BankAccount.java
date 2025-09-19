public class BankAccount {
    String name;
    public int balance;

    public void deposit(int amount){
        System.out.println("Amount deposited:"+amount);
        balance += amount;
    }
    public void withdraw(int amount){
        if(balance<amount){
            System.out.println("Insufficient balance for account"+ name);
        }
        else{
            System.out.println("Amount withdrawn:"+amount);
            balance -= amount;
        }
    }
}