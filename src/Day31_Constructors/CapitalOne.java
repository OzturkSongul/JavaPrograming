package Day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1= new BankAccount();
        account1.setInfo("ahmet", 123456);
        System.out.println(account1);

        account1. deposit(1000);
        account1.CheckBalance();

        account1.withdraw(900);
        account1.CheckBalance();

        account1.deposit(900);
        account1.CheckBalance();

        System.out.println("................");

        BankAccount account2=new BankAccount();
        account2.setInfo("aygun", 45678);

        account2.deposit(10000);
        account2.CheckBalance();


    }
}
