
import java.util.*;
 class BankingSystem {
    String accountName = "neelam";
    int balance = 5000;
    char accountType = 'S';

    public void getdata() {
        System.out.println("accountName- " + accountName);
        System.out.println("balance - " + balance);
        System.out.println("accountType - " + accountType + "\n\n");
       

    }

    public void display() {
         System.out.println("balance - " + balance);
    }

    public void withdrawal() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount -");
        int amt = sc.nextInt();
        if (amt > balance) {
            System.out.println(" don't have sufficient ammount in your account \n\n");
        } else {
            balance = balance - amt;
        System.out.println("\nbalance - " +balance);
            System.out.println("successful transaction\n\n");
            
        }
        
        

    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        int amt;
        System.out.println("enter ammount to deposit");
        amt = sc.nextInt();
        System.out.println("successfully deposite your money");
        balance = balance + amt;
        System.out.println("now your updated balance is " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BankingSystem obj=new BankingSystem();
       

        while (true) {
            System.out.println("\nchoose option \n0.exit \n1.get data\n2.display\n3.withdraw ammount\n4.deposit\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                     obj.getdata();
                    break;

                case 2:
                obj.display();

                    break;

                case 3:

                    obj.withdrawal();

                    break;

                case 4:
                    
                    obj.deposit();

                    break;

                default:
                    System.out.println("Invalid choice! please make a valid choice");
            
            }
        }
    }
}
