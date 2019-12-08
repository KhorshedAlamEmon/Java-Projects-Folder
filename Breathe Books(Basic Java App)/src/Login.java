import java.util.Scanner;

public class Login {
    public void LogIn(){
        int id,pass;
        Scanner input = new Scanner(System.in);
        System.out.println("ID :  ");
        id = input.nextInt();
        System.out.println("PASS : ");
        pass = input.nextInt();
        if(id==100){
            if(pass==1234){
                Books User1 = new Books();
                User1.Shop();
            }
            else {
                System.out.println("Invalid ID or PASSWORD");
            }
        }
    }
}
