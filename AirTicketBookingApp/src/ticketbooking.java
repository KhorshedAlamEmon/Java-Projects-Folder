import java.util.Scanner;
public class ticketbooking {
    String name;
    double balance;
    public ticketbooking(double balance,String name)
    {
        this.balance = balance;
        this.name = name;


    }
    public void buyticket(int amount)
    {   if(amount<=balance) {
        balance = balance - amount;
        System.out.println("$" + balance);
        System.out.println("Ticket Purchase successful");

    }
    }
    public void availableTicket(){
        Scanner in1 = new Scanner(System.in);
        System.out.println(":::::::::::::::::AVAILABLE FLIGHTS:::::::::::::::::::::::");
        System.out.println();
        System.out.println("1. Dhaka to Chittagong-Date: 15/12/2019-Time: 13:45");
        System.out.println("2. Dhaka to Cox's Bazar-Date: 16/12/2019-Time: 11:15");
        System.out.println("3. Chittagong to Dhaka-Date: 22/11/2019-Time: 16:22");
        System.out.println("4. Chittagong to Kolkata-Date: 12/12/2019-Time: 18:25");
        System.out.println("5. Dhaka to Kolkata- Date: 15/12/2019-Time: 12:00");
        System.out.println("6. Dhaka to Katmandu- Date: 02/11/2019-Time: 07:45");
        System.out.println("7. EXIT APP");
        System.out.println("Enter your choice");
        int selection = in1.nextInt();
        String seat;
        int price;
        switch(selection){
            case 1:
                System.out.println("Dhaka to Chittagong-Date: 15/12/2019-Time: 13:45");
                System.out.println();
                System.out.println("::::::::::::::::::::AVAILABLE SEATS:::::::::::::::");
                System.out.println("a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3");
                System.out.println("Enter your seat name : (Example : b4)");
                seat = in1.nextLine();
                System.out.println("Seat Booking Successful :"+seat);
                System.out.println("Total Cost : 1500 TAKA ONLY");
                System.out.println("Enter Amount");
                price = in1.nextInt();
                if(price==1500){
                    buyticket(price);
                    ticket1();
                }
                else {
                    System.out.println("Purchase Failed");
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("2. Dhaka to Cox's Bazar-Date: 16/12/2019-Time: 11:15");
                System.out.println();
                System.out.println("::::::::::::::::::::AVAILABLE SEATS:::::::::::::::");
                System.out.println("a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3");
                System.out.println("Enter your seat name : (Example : b4)");
                seat = in1.nextLine();
                System.out.println("Seat Booking Successful :"+seat);
                System.out.println("Total Cost : 1600 TAKA ONLY");
                System.out.println("Enter Amount");
                price = in1.nextInt();
                if(price==1600){
                    buyticket(price);
                    ticket2();
                }
                else {
                    System.out.println("Purchase Failed");
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("3. Chittagong to Dhaka-Date: 22/11/2019-Time: 16:22");
                System.out.println();
                System.out.println("::::::::::::::::::::AVAILABLE SEATS:::::::::::::::");
                System.out.println("a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3");
                System.out.println("Enter your seat name : (Example : b4)");
                seat = in1.nextLine();
                System.out.println("Seat Booking Successful :"+seat);
                System.out.println("Total Cost : 2500 TAKA ONLY");
                System.out.println("Enter Amount");
                price = in1.nextInt();
                if(price==2500){
                    buyticket(price);
                    ticket3();
                }
                else {
                    System.out.println("Purchase Failed");
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("4. Chittagong to Kolkata-Date: 12/12/2019-Time: 18:25");
                System.out.println();
                System.out.println("::::::::::::::::::::AVAILABLE SEATS:::::::::::::::");
                System.out.println("a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3");
                System.out.println("Enter your seat name : (Example : b4)");
                seat = in1.nextLine();
                System.out.println("Seat Booking Successful :"+seat);
                System.out.println("Total Cost : 1200 TAKA ONLY");
                System.out.println("Enter Amount");
                price = in1.nextInt();
                if(price==1200){
                    buyticket(price);
                    ticket4();
                }
                else {
                    System.out.println("Purchase Failed");
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("5. Dhaka to Kolkata- Date: 15/12/2019-Time: 12:00");
                System.out.println();
                System.out.println("::::::::::::::::::::AVAILABLE SEATS:::::::::::::::");
                System.out.println("a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3");
                System.out.println("Enter your seat name : (Example : b4)");
                seat = in1.nextLine();
                System.out.println("Seat Booking Successful :"+seat);
                System.out.println("Total Cost : 2500 TAKA ONLY");
                System.out.println("Enter Amount");
                price = in1.nextInt();
                if(price==2500){
                    buyticket(price);
                    ticket5();
                }
                else {
                    System.out.println("Purchase Failed");
                    System.out.println();
                }
                break;
            case 6:
                System.out.println("6. Dhaka to Katmandu- Date: 02/11/2019-Time: 07:45");
                System.out.println();
                System.out.println("::::::::::::::::::::AVAILABLE SEATS:::::::::::::::");
                System.out.println("a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3");
                System.out.println("Enter your seat name : (Example : b4)");
                seat = in1.nextLine();
                System.out.println("Seat Booking Successful :"+seat);
                System.out.println("Total Cost : 1700 TAKA ONLY");
                System.out.println("Enter Amount");
                price = in1.nextInt();
                if(price==1700){
                    buyticket(price);
                    ticket6();
                }
                else {
                    System.out.println("Purchase Failed");
                    System.out.println();
                }
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid Choice");
                System.out.println();
                System.out.println("Try Again");
                availableTicket();
                break;

        }
    }


    public void ticket1() {
        System.out.println(":::::::::::::::::::::AIR TICKET::::::::::::::::::");
        System.out.println();
        System.out.println("::::::::::::::::::FLIGHT : US BANGLA:::::::::::::");
        System.out.println();
        System.out.println("Customer Name :"+name);
        System.out.println("From : DHAKA");
        System.out.println("To : Chittagong");
        System.out.println("Boarding Time :  13:45");
        System.out.println("Date : 15/12/2019");

    }
    public void ticket2() {
        System.out.println(":::::::::::::::::::::AIR TICKET::::::::::::::::::");
        System.out.println();
        System.out.println("::::::::::::::::::FLIGHT : US BANGLA:::::::::::::");
        System.out.println();
        System.out.println("Customer Name :"+name);
        System.out.println("From : DHAKA");
        System.out.println("To : Cox's Bazar");
        System.out.println("Boarding Time :  13:45");
        System.out.println("Date : 16/12/2019");

    }
    public void ticket3(){
        System.out.println(":::::::::::::::::::::AIR TICKET::::::::::::::::::");
        System.out.println();
        System.out.println("::::::::::::::::::FLIGHT : US BANGLA:::::::::::::");
        System.out.println();
        System.out.println("Customer Name :"+name);
        System.out.println("From : DHAKA");
        System.out.println("To : Chittagong");
        System.out.println("Boarding Time :  16:22");
        System.out.println("Date : 22/11/2019");
    }
    public void ticket4(){
        System.out.println(":::::::::::::::::::::AIR TICKET::::::::::::::::::");
        System.out.println();
        System.out.println("::::::::::::::::::FLIGHT : US BANGLA:::::::::::::");
        System.out.println();
        System.out.println("Customer Name :"+name);
        System.out.println("From : Chittagong");
        System.out.println("To : KOLKATA");
        System.out.println("Boarding Time :  18:25");
        System.out.println("Date : 12/12/2019");
    }
    public void ticket5(){
        System.out.println(":::::::::::::::::::::AIR TICKET::::::::::::::::::");
        System.out.println();
        System.out.println("::::::::::::::::::FLIGHT : US BANGLA:::::::::::::");
        System.out.println();
        System.out.println("Customer Name :"+name);
        System.out.println("From : DHAKA");
        System.out.println("To : KOLKATA");
        System.out.println("Boarding Time :  12:00");
        System.out.println("Date : 15/12/2019");
    }
    public void ticket6(){
        System.out.println(":::::::::::::::::::::AIR TICKET::::::::::::::::::");
        System.out.println();
        System.out.println("::::::::::::::::::FLIGHT : US BANGLA:::::::::::::");
        System.out.println();
        System.out.println("Customer Name :"+name);
        System.out.println("From : DHAKA");
        System.out.println("To : KATMANDHU");
        System.out.println("Boarding Time :  07:45");
        System.out.println("Date : 02/11/2019");
    }


}

