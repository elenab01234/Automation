package tema07;

//2. Creează clasa BankAccount:
public class BankAccount {

    //  Atribute: ownerName,balance
    String ownerName;
    double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Metoda: deposit(double amount)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("S-au depus " + amount + " lei.");
    }

    // Metoda: withdraw(double amount)
    // nu permite retragere dacă balance < amount
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Retragere " + amount + " lei.");
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }

    // Metoda: displayBalance()
    public void displayBalance() {
        System.out.println("Sold curent: " + balance + " lei.");
    }

    public static void main(String[] args) {
        //    creează un cont
        BankAccount account = new BankAccount("Elena", 10000);

        // fă 2 depuneri și 1 retragere
        account.deposit(500);
        account.deposit(1000);
        account.withdraw(700);

        account.displayBalance();
    }
}