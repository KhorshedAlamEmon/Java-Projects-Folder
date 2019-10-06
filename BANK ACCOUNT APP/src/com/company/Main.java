package com.company;

import java.io.PrintStream;
import java.net.SocketOption;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(":::::::::::::WELCOME TO THE BANK MANAGEMENT APP::::::::::::");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        while (true) {
            System.out.println(":::::::::::::::::::::::LOGIN PAGE:::::::::::::::::::::::::");

            Scanner in = new Scanner(System.in);
            int id, pass;
            System.out.println("ID : ");
            id = in.nextInt();
            System.out.println("PASSWORD : ");
            pass = in.nextInt();

            if (id == 100) {
                if (pass == 1234) {
                    Account Account1 = new Account(1200);
                    Account1.userInfo();

                } else {
                    System.out.println("Wrong id and password");
                }
            }
            if (id == 200) {
                if (pass == 1234) {
                    Account Account2 = new Account(1000);
                    Account2.userInfo2();
                } else {
                    System.out.println("Wrong id and password");
                }
            }
            if (id == 300) {
                if (pass == 1234) {
                    Account Account3 = new Account(1500);
                    Account3.userInfo3();
                } else {
                    System.out.println("Wrong id and password");
                }
            }
            if (id == 400) {
                if (pass == 1234) {
                    Account Account4 = new Account(1800);
                    Account4.userInfo4();
                } else {
                    System.out.println("Wrong id and password");
                }
            }
            if (id == 500) {
                if (pass == 1234) {
                    Account Account5 = new Account(900);
                    Account5.userInfo5();
                } else {
                    System.out.println("Wrong id and password");
                }
            }
        }
    }

}