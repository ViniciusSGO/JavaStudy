import java.util.Scanner;

public class Account {
    private long number;
    private long agency;
    private double balance;
    private double availableCredit;
    private int password;
    private int accountTime;
    private Client client;
    private Bank bank;

    Scanner scan = new Scanner(System.in);
    long contador;

    public Account(Client c, Bank b, int password) {
        this.number = contador;
        contador++;
        this.password = password;
        this.agency = scan.nextLong();
        this.accountTime = 0;
        this.client = c;
        c.addAccountC(this);
        this.bank = b;
        b.addAccountB(this);
    }

    public boolean withdraw(double amount, int password) {
        if (this.password == password) {
            if (this.balance >= amount) {
                this.balance -= amount;
                return true;
            } else if (this.balance + this.availableCredit >= amount) {
                this.availableCredit += (this.balance - amount);
                this.balance = 0;
                return true;
            }
        }
        return false;
    }

    public boolean deposit(double amount, int password) {
        if (this.password == password) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double increaseLimit(double amount, int password) {
        if (this.password == password) {
            double increase = bank.approveLimit(amount, this.accountTime);
            this.availableCredit += increase;
            return increase;
        }
        return -1;
    }

    public double balance(int password) {
        if (this.password == password) {
            return this.balance;
        } else return -1;
    }

    public void delAccount(Client c, int password) {
    }

    public long getNumber() {
        return number;
    }

    public long getAgency() {
        return agency;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public int getAccountTime() {
        return accountTime;
    }

}