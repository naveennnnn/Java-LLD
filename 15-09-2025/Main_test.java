public class Main_test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        BankAccount account_1 = new BankAccount();
        account_1.name = "Naveen";
        account_1.balance = 1000;
        account_1.deposit(5000);
        account_1.withdraw(200);
        account_1.withdraw(2000);
    }
}