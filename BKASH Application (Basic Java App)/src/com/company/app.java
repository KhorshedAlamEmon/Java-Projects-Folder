package com.company;

import java.util.Scanner;

public class app {
    private int selection;
    UserApp res = new UserApp(50000);

        public void UserLogin() {
        int id, pass;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your Bkash Phone Number");
        System.out.println("Phone Number : ");
        id = in.nextInt();
        System.out.println("Please Enter Your Bkash PIN");
        System.out.println("PIN Code : ");
        pass = in.nextInt();
        if (id == 1234) {
            if (pass == 1234) {
                System.out.println(":::::::::::BKASH APP::::::::::::");
                System.out.println();
                UserApp res = new UserApp(50000);
                System.out.println("Welcome to The BKash App");
                setting();
            }
        } else {
            System.out.println("Invalid Password");
            UserLogin();
        }
    }
        public void setting () {
        int choose;
        System.out.println(" :::::::USER MENU::::::::::");
        System.out.println();
        System.out.println("Type 1 for Send Money");
        System.out.println("Type 2 for Mobile Recharge");
        System.out.println("Type 3 for Add Money in Bkash App");
        System.out.println("Type 4 for CashOut Request");
        System.out.println("Type 5 for Check Balance");
        System.out.println("Type 6 for Electric Bill pay");
        System.out.println("Type 7 for Helpline");
        System.out.println("Type 8 for Exit");
        System.out.println();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        choose = in1.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter the Agent / Bkash number For Send Money");
                System.out.println();
                int input = in1.nextInt();
                if (input == 1234) {
                    System.out.println("Enter the Amount");
                    double amount = in1.nextDouble();
                    res.setSendMoney(amount);
                    System.out.println();
                    setting();

                } else {
                    System.out.println("Bkash ID Not Found");
                    System.out.println();
                    setting();
                }
                break;
            case 2:
                System.out.println("Enter The Phone NUmber for recharge");
                int input1 = in1.nextInt();
                if (input1 == 1234) {
                    System.out.println("Enter Amount");
                    double amount = in1.nextDouble();
                    res.setMobilerecharge(amount);
                    setting();
                    System.out.println();
                } else {
                    System.out.println("Bkash ID not found");
                    setting();
                    System.out.println();
                }
                break;
            case 3:
                double amount;
                System.out.println("Enter Amount for add money on your account");
                amount = in1.nextDouble();
                res.setUserBalance(amount);
                setting();
                System.out.println();
                break;
            case 4:
                System.out.println("Enter the Agent / Bkash number For Send Money");
                int input3 = in1.nextInt();
                if (input3 == 1234) {
                    System.out.println("Enter the Amount");
                    double amount1 = in1.nextDouble();
                    res.setCashout(amount1);
                    setting();
                    System.out.println();
                } else {
                    System.out.println("Bkash ID Not Found");
                    setting();
                    System.out.println();
                }
                break;
            case 5:
                res.getUserBalance();
                setting();
                System.out.println();
                break;
            case 6:
                System.out.println("Enter Your Electric Bill A/C number");
                int num = in1.nextInt();
                if (num == 1234) {
                    System.out.println("Enter Amount");
                    double amount4 = in1.nextDouble();
                    res.electric(amount4);
                    setting();
                    System.out.println();
                } else {
                    System.out.println("Invalid A/C Number");
                    setting();
                    System.out.println();
                }
                break;
            case 7:
                res.helpline();
                setting();
                System.out.println();
                break;
            case 8:
                break;
            default:
                System.out.println("Invalid Choice try Again");
                setting();
                System.out.println();
                break;

        }
    }

}
