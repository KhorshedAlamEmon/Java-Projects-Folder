package com.company;

public class UserApp {
    private double userBalance;
    private double mobileBalance = 00.00;
    public UserApp(double newBalance){
        if(newBalance>= 0.00){
            userBalance = newBalance;
            System.out.println("User Balance : USD"+userBalance);
        }

    }
    public void setSendMoney(double amount){
        if(amount<= userBalance){
            userBalance = userBalance - amount;
            System.out.println(" Money Sent : USD"+amount);
            System.out.println("Money Sending Successful");
            System.out.println("New Balance : USD"+userBalance);
            System.out.println();
        }
        else {
            System.out.println("Insufficient Balance");
            System.out.println("Balance : USD"+userBalance);
        }
    }
    public void setMobilerecharge(double amount){
        if(amount<=userBalance){
            userBalance = userBalance - amount;
            mobileBalance = mobileBalance + amount;
            System.out.println("Transection Successful USD"+amount);
            System.out.println("Phone Balance : USD"+mobileBalance);
            System.out.println();
        }
        else {
            System.out.println("Mobile Recharge unsuccessful due to low Balance");
        }
    }
    public void setUserBalance(double amount){
        System.out.println();
        userBalance = userBalance + amount;
        System.out.println("Balance Added successfully USD"+amount);
        System.out.println("New Balance : USD"+userBalance);
    }
    public void setCashout(double Cash){
        if(Cash<=userBalance){
            userBalance = userBalance - Cash;
            System.out.println();
            System.out.println("Cash Out Successful USD"+Cash);
            System.out.println("Transection Number : 6667282347474");
            System.out.println("Thanks for using Bkash App");
        }
    }
    public double getUserBalance(){
        System.out.println("USD"+userBalance);
        return userBalance;
    }
    public void electric(double amount){
        if(amount<=userBalance){
            userBalance = userBalance - amount;
            System.out.println("Bill payment Successful");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    public void helpline(){
        System.out.println("::::::Welcome to the Helpline Section::::::::");
        System.out.println();
        System.out.println("Contact US : Call 16242 or go to www.bkash.com");
        System.out.println("Thanks For Using Bkash Application");
        System.out.println();
    }
}
