package Day31_Constructors;

public class BankAccount {

    public String name;
    public long accountNumber;
    public double balance;

    public void setInfo(String name, long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    }

    public void CheckBalance(){
        System.out.println("your avaible balance is "+ balance);}

    public void deposit(double amount){
        if(amount<=0) {
            System.out.println("depositing amount can not be zero or negative");
            return;
        }
        balance+= amount;
        }


        public void withdraw(double amount){
        if(amount>balance) {
            System.out.println("insufficient balance");
            return;
        }
        if(amount<=0){
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance-=amount;

        }

}
