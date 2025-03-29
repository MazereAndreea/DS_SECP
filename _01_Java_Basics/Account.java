package _01_Java_Basics;

public class Account {
    // Instance variable
    private String name;
    private double balance;

    // Class variables (static fields)
    private static int totalAccounts = 0;

    // Constructor with parameters
    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    // Method: deposit
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(this.balance > amount) {
            balance = amount;
            System.out.println("Ati retras bani");
        }
        else{
            System.out.println("Fonduri insuficiente");
        }
    }

    public void displayInfo(){
        System.out.println("Nume " + this.name);
        System.out.println("Balanta " + this.balance);
        System.out.println("Numar de conturi " + this.totalAccounts);
    }
    public static void main(String[] args) {
        Account acc1 = new Account("Costel",200);
        Account acc2 = new Account("Mirel",500);

        acc1.deposit(1500);
        acc1.displayInfo();
    }

}
