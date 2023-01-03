//Jason Buras Problem 4: ATM Banking
public class Account {
    private static int count;
    private String name;
    private String pin;
    private int id;
    private double balance;

    public Account(String name, String pin){
        this.name = name;
        this.pin=pin;
        this.balance=0;
        this.id = count++;

    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public double getBalance(){
        return balance;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public boolean isPin(String attempt){
        return pin == attempt;
    }
    public double withdraw(double amount){
        if(balance-amount >= 0){
            this.balance -= amount;
        }
        return this.balance;
    }
    public String toString(){
        return String.format("Name: %s, Account ID: %d, Balance: $%.02f", name, id, balance);
    }
}
