package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Account {
    private double Balance;
    public Account(double oldbalance){
        if(oldbalance>0.0){
            Balance = oldbalance;
            System.out.printf("Balance : $%.2f\n", Balance);
        }
    }
    public void setBalance(double amount){

        Balance = Balance + amount;

    }


    public void setCashOut(double amount){
        if(Balance >= amount) {
            Balance = Balance - amount;
            getCashMemo();
            System.out.printf("Cash out Successful : $%.2f\n", amount);

        }
        if(Balance<amount)
        {
            System.out.println("Insufficient Balance");

        }

    }
    public double getBalance(){
        System.out.printf("Balance : $%.2f\n", Balance);
        return Balance;
    }
    public void requestLoan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to get loan");
        double getLoan = input.nextDouble();
        Balance = Balance + getLoan;
        System.out.println("Loan successful $ :"+Balance);
    }
    public void payLoan(){
        double paybill;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter amount to pay loan");
        paybill = input1.nextDouble();
        if(Balance>= paybill){
            Balance = Balance - paybill;
            System.out.println("Loan payed Successfully $"+Balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void getCashMemo(){
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println(":::::::::::::::::::XYZ BANK LTD:::::::::::::::::::");
        System.out.println(":::::::::::::::::::::CASH MEMO:::::::::::::::::::::::");
        System.out.println("TERMINAL : 30012123");
        System.out.println("ADDRESS : XYZ BANK CHITTAGONG BANGLADESH");
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh : mm : ss");
        String formate = time.format(formatter);
        System.out.printf("TIME : %s", formate);
        Date date = new Date();
        DateFormat dateFormate = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormate.format(date);
        System.out.println();
        System.out.println(" "+currentDate);
        System.out.println(" ");
        System.out.println("ID : XXX");
        System.out.println("APPROVE CODE : 70982   STAN : 87096");
        System.out.println("TRANSACTION ID : 425276378");
        System.out.println("TRANSACTION TYPE : CASH OUT");
        System.out.println(" TRANSACTION COMPLETED ");
        System.out.printf(" \n", getBalance());
    }

    public void userInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("Name : Mr. Khorshed Alam");
        System.out.println("ID : 100");
        System.out.println("Phone : 01875974513");
        System.out.println("---------------------------------------------------");
        while(true){
            System.out.println("Type 1 - To Add Balance");
            System.out.println("Type 2 - For Cash Out");
            System.out.println("Type 3 - For Logout");
            System.out.println("type 4 - For Report");
            System.out.println("Type 5 - Get Loan");
            System.out.println("Type 6 - Pay Loan Bill");

            double selection, amount;
            Scanner in = new Scanner(System.in);
            selection = in.nextDouble();

            if (selection == 1) {
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("Welcome to the Deposit Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setBalance(amount);
                System.out.printf("Account Balance : $%.2f\n", getBalance());
                System.out.println("Thanks For Using Bank Management App");
                System.out.println("----------------------------------------------");
            }
            if (selection == 2) {
                System.out.println();
                System.out.println("Welcome to the Cash Out Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setCashOut(amount);
                System.out.println("Thanks For Using Bank Management App");
                System.out.println();
                System.out.println("----------------------------------------------");

            }
            if (selection == 3) {
                System.out.println("Logout Successfully");
                System.out.println("Thanks For Using Bank Management App");
                break;
            }
            if(selection == 4){
                System.out.println("If you are facing any problem then Contact Us : +8801875974513(Khorshed)");
            }
            if(selection == 5){
                System.out.println("welcome to the Loan Section");
                requestLoan();
            }
            if(selection == 6){
                System.out.println("Welcome to the Payment Loan");
                payLoan();
            }

            System.out.printf("Account Balance : $%.2f\n", getBalance());
            System.out.println();
            System.out.printf("Final Balance : $%.2f\n", getBalance());

        }

    }
    public void userInfo2(){
        System.out.println("--------------------------------------------------");
        System.out.println("Name : Mr. Jahed Alam");
        System.out.println("ID : 200");
        System.out.println("Phone : 01875974514");
        System.out.println("---------------------------------------------------");
        while(true){
            System.out.println("Type 1 - To Add Balance");
            System.out.println("Type 2 - For Cash Out");
            System.out.println("Type 3 - For Logout");
            System.out.println("Type 4 - For Report");
            System.out.println("Type 5 - Get Loan");
            System.out.println("Type 6 - Pay Loan Bill");
            double selection, amount;
            Scanner in = new Scanner(System.in);
            selection = in.nextDouble();

            if (selection == 1) {
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("Welcome to the Deposit Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setBalance(amount);
                System.out.printf("Account Balance : $%.2f\n", getBalance());

                System.out.println("Thanks For Using Bank Management App");
                System.out.println("----------------------------------------------");
            }
            if (selection == 2) {
                System.out.println();
                System.out.println("Welcome to the Cash Out Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setCashOut(amount);
                System.out.println("Thanks For Using Bank Management App");
                System.out.println();
                System.out.println("----------------------------------------------");

            }
            if (selection == 3) {
                System.out.println("Logout Successfully");
                System.out.println("Thanks For Using Bank Management App");
                break;
            }
            if(selection == 4){
                System.out.println("If you are facing any problem then Contact Us : +8801875974513(Khorshed)");
            }
            if(selection == 5){
                System.out.println("welcome to the Loan Section");
                requestLoan();
            }
            if(selection == 6){
                System.out.println("Welcome to the Payment Loan");
                payLoan();
            }

            System.out.printf("Account Balance : $%.2f\n", getBalance());
            System.out.println();
            System.out.printf("Final Balance : $%.2f\n", getBalance());

        }
    }
    public void userInfo3(){
        System.out.println("--------------------------------------------------");
        System.out.println("Name : Mr. Ahmed");
        System.out.println("ID : 300");
        System.out.println("Phone : 01875974515");
        System.out.println("---------------------------------------------------");
        while(true){
            System.out.println("Type 1 - To Add Balance");
            System.out.println("Type 2 - For Cash Out");
            System.out.println("Type 3 - For Logout");
            System.out.println("Type 4 - For Report");
            System.out.println("Type 5 - Get Loan");
            System.out.println("Type 6 - Pay Loan Bill");
            double selection, amount;
            Scanner in = new Scanner(System.in);
            selection = in.nextDouble();

            if (selection == 1) {
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("Welcome to the Deposit Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setBalance(amount);
                System.out.printf("Account Balance : $%.2f\n", getBalance());
                System.out.println("Thanks For Using Bank Management App");
                System.out.println("----------------------------------------------");
            }
            if (selection == 2) {
                System.out.println();
                System.out.println("Welcome to the Cash Out Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setCashOut(amount);
                System.out.println("Thanks For Using Bank Management App");
                System.out.println();
                System.out.println("----------------------------------------------");
            }
            if (selection == 3) {
                System.out.println("Logout Successfully");
                System.out.println("Thanks For Using Bank Management App");
                break;
            }
            if(selection == 4){
                System.out.println("If you are facing any problem then Contact Us : +8801875974513(Khorshed)");
            }
            if(selection == 5){
                System.out.println("welcome to the Loan Section");
                requestLoan();
            }
            if(selection == 6){
                System.out.println("Welcome to the Payment Loan");
                payLoan();
            }

            System.out.printf("Account Balance : $%.2f\n", getBalance());
            System.out.println();
            System.out.printf("Final Balance : $%.2f\n", getBalance());

        }
    }
    public void userInfo4(){
        System.out.println("--------------------------------------------------");
        System.out.println("Name : Mr. Jamal");
        System.out.println("ID : 400");
        System.out.println("Phone : 01875974515");
        System.out.println("---------------------------------------------------");
        while(true){
            System.out.println("Type 1 - To Add Balance");
            System.out.println("Type 2 - For Cash Out");
            System.out.println("Type 3 - For Logout");
            System.out.println("Type 4 - For Report");
            System.out.println("Type 5 - Get Loan");
            System.out.println("Type 6 - Pay Loan Bill");
            double selection, amount;
            Scanner in = new Scanner(System.in);
            selection = in.nextDouble();

            if (selection == 1) {
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("Welcome to the Deposit Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setBalance(amount);
                System.out.printf("Account Balance : $%.2f\n", getBalance());
                System.out.println("Thanks For Using Bank Management App");
                System.out.println("----------------------------------------------");
            }
            if (selection == 2) {
                System.out.println();
                System.out.println("Welcome to the Cash Out Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setCashOut(amount);
                System.out.println("Thanks For Using Bank Management App");
                System.out.println();
                System.out.println("----------------------------------------------");
            }
            if (selection == 3) {
                System.out.println("Logout Successful");
                System.out.println("Thanks For Using Bank Management App");
                break;
            }
            if(selection == 4){
                System.out.println("If you are facing any problem then Contact Us : +8801875974513(Khorshed)");
            }
            if(selection == 5){
                System.out.println("welcome to the Loan Section");
                requestLoan();
            }
            if(selection == 6){
                System.out.println("Welcome to the Payment Loan");
                payLoan();
            }

            System.out.printf("Account Balance : $%.2f\n", getBalance());
            System.out.println();
            System.out.printf("Final Balance : $%.2f\n", getBalance());

        }
    }
    public void userInfo5(){
        System.out.println("--------------------------------------------------");
        System.out.println("Name : Mr. kamal");
        System.out.println("ID : 500");
        System.out.println("Phone : 01875974516");
        System.out.println("---------------------------------------------------");
        while(true){
            System.out.println("Type 1 - To Add Balance");
            System.out.println("Type 2 - For Cash Out");
            System.out.println("Type 3 - For Logout");
            System.out.println("Type 4 - For Report");
            System.out.println("Type 5 - Get Loan");
            System.out.println("Type 6 - Pay Loan Bill");
            double selection, amount;
            Scanner in = new Scanner(System.in);
            selection = in.nextDouble();

            if (selection == 1) {
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("Welcome to the Deposit Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setBalance(amount);
                System.out.printf("Account Balance : $%.2f\n", getBalance());
                System.out.println("Thanks For Using Bank Management App");
                System.out.println("----------------------------------------------");
            }
            if (selection == 2) {
                System.out.println();
                System.out.println("Welcome to the Cash Out Section");
                System.out.println("Enter Amount\n");
                amount = in.nextDouble();
                setCashOut(amount);
                System.out.println("Thanks For Using Bank Management App");
                System.out.println();
                System.out.println("----------------------------------------------");
            }
            if (selection == 3) {
                System.out.println("Logout Successful");
                System.out.println("Thanks For Using Bank Management App");
                break;
            }
            if(selection == 4){
                System.out.println("If you are facing any problem then Contact Us : +8801875974513(Khorshed)");
            }
            if(selection == 5){
                System.out.println("welcome to the Loan Section");
                requestLoan();
            }
            if(selection == 6){
                System.out.println("Welcome to the Payment Loan");
                payLoan();
            }

            System.out.printf("Account Balance : $%.2f\n", getBalance());
            System.out.println();
            System.out.printf("Final Balance : $%.2f\n", getBalance());

        }
    }
}

