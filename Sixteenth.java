package Hard;
import java.util.Scanner;
class Sixteenth {
    int accNo;
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Balance after deposit: " + balance);
    }

    void withdraw(double amt) {
        if(amt <= balance){
            balance -= amt;
            System.out.println("Balance after withdrawal: " + balance);
        }
        else System.out.println("Withdrawl amount greater than current balance.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sixteenth b = new Sixteenth();
        System.out.print("Enter Bank Account Number: ");
        b.accNo = sc.nextInt();
        System.out.print("Enter Bank Balance: ");
        b.balance = sc.nextDouble();
        System.out.print("Enter amount to deposit: ");
        b.deposit(sc.nextDouble());
        System.out.print("Enter amount to withdraw: ");
        b.withdraw(sc.nextDouble());
        sc.close();
    }
}