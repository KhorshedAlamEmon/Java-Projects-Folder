import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println(":::::::::::::WELCOME TO THE US-BANGLA TICKET BOOKING APP::::::::::::::");
        System.out.println();
        System.out.println(":::::::::::::::::::::::::::ABOUT US::::::::::::::::::::::::::::::::::::");
        System.out.println("US-Bangla Airlines is a privately owned Bangladeshi airline headquartered in Dhaka ");
        System.out.println(" and based at Shahjalal International Airport. The airline is the largest private");
        System.out.println(" airlines in Bangladesh in terms of fleet size and overall second largest airlines ");
        System.out.println("after the Flag carrier Biman Bangladesh Airlines.");
        System.out.println();
        System.out.println("Headquarters location: Dhaka");
        System.out.println("Parent company: US-Bangla Group");
        System.out.println("Motto: Fly Fast - Fly Safe");
        System.out.println("Commenced operations: 17 July 2014");
        System.out.println("Hub: Hazrat Shahjalal International Airport");
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Please Enter your name");
            String name1 = in.nextLine();
            ticketbooking buyTicket = new ticketbooking(5000.00,name1);
            buyTicket.availableTicket();
        }
    }
}
