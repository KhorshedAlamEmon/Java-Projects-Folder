import java.util.Scanner;

public class Books {
    private double bookprice;
    PaymentSystem price = new PaymentSystem(50000);
    public void Shop(){

            System.out.println("BOOK COLLECTIONS");
            int choose;
            Scanner in2 = new Scanner(System.in);
            System.out.println("1. Writer's Section");
            System.out.println("2. Best Selling Section");
            System.out.println("3. LogOut");
            System.out.println();
            choose = in2.nextInt();
            switch (choose) {
                case 1:
                    ShopWritter();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

    }
    public void ShopWritter(){
        while(true) {
            System.out.println("::::::::::::::::Writer Section:::::::::::::::");
            System.out.println("Type 1 : J.K Rowling");
            System.out.println("Type 2 : Paulo Coelho");
            System.out.println("Type 3 : Go to Main Page");
            int select;
            Scanner in1 = new Scanner(System.in);
            select = in1.nextInt();
            switch (select) {
                case 1:
                    JKRowling();
                    break;
                case 2:
                    PauloCoelho();
                    break;
                case 3:
                    Shop();
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }

    }
   public void JKRowling(){
       Scanner in = new Scanner(System.in);
       System.out.println(":::::::::::::Welcome to the Library of JK Rowling::::::::::::::::");
       System.out.println("Book Lists :");
       System.out.println(" 1. Harry Potter and the Philosophers Stone (1997) (Series -1) (Paperback) -J.K Rowling");
       System.out.println(" 2. Harry Potter and the Prisoner of Azkaban (1999) (Series-3- New Jacket) -J.K Rowling");
       System.out.println(" 3. Harry Potter and the Chamber of Secrets (1998) (Series -2) (Paperback) -J.K Rowling");
       System.out.println(" 4. Harry Potter And The Cursed Child - Parts I And Ii (2016) (Series-8) (Special Rehearsal Edition Script) (Paperback) -J.K Rowling");
       System.out.println(" 5. Harry Potter and the Deathly Hallows (Series-7) (Paperback) -J.K Rowling");
       System.out.println("Enter the serial number !");
       int bookselection = in.nextInt();

       if(bookselection== 1){
           System.out.println("Book Name : Harry Potter and the Philosophers Stone (1997) (Series -1) (Paperback) - by J.K Rowling");
           System.out.println(" Rating = 7/10");
           System.out.println("Price : 289 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 289){
               System.out.println("Book Name : হ্যারি পটার অ্যান্ড দ্য ফিলসফারস স্টোন (১৯৯৭)\n" +
                       "\n" +
                       "জে. কে. রাওলিং");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }
       if(bookselection== 2){
           System.out.println("Book Name : Harry Potter and the Prisoner of Azkaban (1999) (Series-3- New Jacket) -JK Rowling ");
           System.out.println(" Rating = 9/10");
           System.out.println("Price : 299 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 299){
               System.out.println("Book Name : Harry Potter and the Prisoner of Azkaban (1999) (Series-3- New Jacket) -JK Rowling");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }

       }
       if(bookselection== 3){
           System.out.println("Book Name : Harry Potter and the Chamber of Secrets (1998) (Series -2) (Paperback) -J.K Rowling");
           System.out.println(" Rating = 9/10");
           System.out.println("Price : 180 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 180){
               System.out.println("Book Name : Harry Potter and the Chamber of Secrets (1998) (Series -2) (Paperback) -J.K Rowling");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }

       }
       if(bookselection== 4){
           System.out.println("Book Name :  Harry Potter And The Cursed Child - Parts I And Ii (2016) (Series-8) (Special Rehearsal Edition Script) (Paperback) -J.K Rowling");
           System.out.println(" Rating = 9.8/10");
           System.out.println("Price : 181 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 181){
               System.out.println("Book Name : Harry Potter and the Chamber of Secrets (1998) (Series -2) (Paperback) -J.K Rowling");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }
       if(bookselection== 5){
           System.out.println("Book Name : Harry Potter and the Deathly Hallows (Series-7) (Paperback) -J.K Rowling  ");
           System.out.println(" Rating = 9.1/10");
           System.out.println("Price : 185 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 185){
               System.out.println("Book Name : Harry Potter and the Deathly Hallows (Series-7) (Paperback) -J.K Rowling");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }


   }
   public void PauloCoelho(){
       int bookselection;
       Scanner in = new Scanner(System.in);
       System.out.println(":::::::::::::::Welcome to the Paul Coelho's Library:::::::::::::::::::::");
       System.out.println(":::::::::::::::::::::::পাওলো কোয়েলহো:::::::::::::::::::::\n" +
               "Paulo Coelho de Souza born August 24, 1947. He is a Brazilian lyricist and novelist.\n");
       System.out.println("Book Lists :");
       System.out.println("1. The Alchemist (About 150 Million Copies Sold) (Paperback) by Paulo Coelho");
       System.out.println("2. Eleven Minutes (The International Bestseller) (Paperback) by Paulo Coelho");
       System.out.println("3. The Spy  (The International Bestseller) (Paperback) by Paulo Coelho");
       System.out.println("4. Veronika Decides to Die (Paperback) by Paulo Coelho");
       System.out.println("5. The Fifth Mountain by Paulo Coelho ");
       System.out.println("Enter Selection");
       bookselection = in.nextInt();
       if(bookselection== 1){
           System.out.println("Book Name : The Alchemist (About 150 Million Copies Sold) (Paperback) by Paulo Coelho  ");
           System.out.println(" Rating = 9.7/10");
           System.out.println("Price : 300 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 300){
               System.out.println("Book Name : The Alchemist (About 150 Million Copies Sold) (Paperback) by Paulo Coelho");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }
       if(bookselection== 2){
           System.out.println("Book Name : Eleven Minutes (The International Bestseller) (Paperback) by Paulo Coelho  ");
           System.out.println(" Rating = 8.5/10");
           System.out.println("Price : 350 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 350){
               System.out.println("Book Name :Eleven Minutes (The International Bestseller) (Paperback) by Paulo Coelho");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }
       if(bookselection== 3){
           System.out.println("Book Name :  The Spy  (The International Bestseller) (Paperback) by Paulo Coelho  ");
           System.out.println(" Rating = 8.1/10");
           System.out.println("Price : 600 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 600){
               System.out.println("Book Name : The Spy  (The International Bestseller) (Paperback) by Paulo Coelho");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }
       if(bookselection== 4){
           System.out.println("Book Name :  Veronika Decides to Die (Paperback) by Paulo Coelho ");
           System.out.println(" Rating = 8.9/10");
           System.out.println("Price : 500 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 500){
               System.out.println("Book Name :  Veronika Decides to Die (Paperback) by Paulo Coelho");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }
       if(bookselection== 5){
           System.out.println("Book Name : The Fifth Mountain by Paulo Coelho  ");
           System.out.println(" Rating = 9.5/10");
           System.out.println("Price : 1200 Taka Only");
           System.out.println("Enter Price to buy");
           bookprice = in.nextDouble();
           if(bookprice == 1200){
               System.out.println("Book Name : The Fifth Mountain by Paulo Coelho");
               price.pay(bookprice);
               System.out.println("Purchase Successful");
           }
           else{
               System.out.println("Purchase Unsuccessful");
           }
       }
   }
}
