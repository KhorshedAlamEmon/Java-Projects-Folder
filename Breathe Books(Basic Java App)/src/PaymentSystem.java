import java.util.Scanner;

public class PaymentSystem {
    private double Balance;
    public PaymentSystem(double initialBalace){
        if(initialBalace>= 0.0){
            Balance = initialBalace;
        }
    }
    public void recharge(double amount){
        Balance = Balance + amount;
    }
    public void pay(double amount){
        if(Balance>= amount){
            Balance = Balance - amount;
            System.out.println("Purchased Successfully : TK"+amount);
            System.out.println("Balance : TK"+Balance);

        }
        else if(Balance<=amount){
            System.out.println("You do not have enough Balance in your Account");
            System.out.println("Would you like to Re-charge?");
            int selection;
            Scanner input = new Scanner(System.in);
            System.out.println("Type 1 - YES");
            System.out.println("Type 2 - NO");
            selection = input.nextInt();
            if(selection== 1){
                double payment;
                System.out.println("::::::::::::Welcome to the Recharge Section::::::::::::::::::");
                System.out.println("Enter Amount");
                payment = input.nextDouble();
                recharge(payment);
            }
            else{
                System.out.println("Command Cancelled");
                //ekhane selection er mathod call dibo//
            }
        }
    }

}
