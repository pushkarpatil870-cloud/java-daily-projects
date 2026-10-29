import java.util.Scanner;

public class ATM{
    static double balance = 1000.0;  //globle every method use this variable
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(true){
            System.out.println("\n 1.Check Balance 2.Deposite 3.Withdraw 4.Exit");
            System.out.print("Choose:");
            int ch = sc.nextInt();

            if(ch == 1) checkBalance();
            else if (ch==2) deposite();
            else if(ch==3) Withdraw();
            else if(ch ==4){
                System.out.println("Bye!");
                break;
            }
            else{
                System.out.println("Invalid Choice!");
            }


        }
    }

    public static void checkBalance(){
        System.out.println("Balance:"+balance);
        System.out.println("Balance(int):"+(int)balance);
    }

    public static void deposite() {
        System.out.print("Deposite Amount: ");
        double amt = sc.nextDouble();

        if(amt>0){
            balance = balance+amt;
            System.out.println("Deposited!");
        }
        else{
            System.out.println("Invalid Amount!");
        }

    }

    public static void Withdraw(){
        System.out.println("Withdraw Amount: ");
        double amt = sc.nextDouble();

        if(amt>0 && amt<=balance){
            balance= balance-amt;
            System.out.println("Withdrawan!");
        }
        else{
            System.out.println("Insufficient / Invalid");
        }
    }
}
