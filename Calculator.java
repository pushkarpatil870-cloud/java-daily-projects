import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Welcome To Calculator:");
            System.out.print("Enter First Number:");
            int num1 = sc.nextInt();
            System.out.print("Now,Enter Second Number:");
            int num2 = sc.nextInt();

            int add = Add(num1, num2);
            System.out.println("The Addition Is:"+add);

            int sub = Sub(num1,num2);
            System.out.println("The Substraction Is:"+sub);

            int mul = Mul(num1, num2);
            System.out.println("The Product Is:"+mul);

            int div = Div(num1, num2);
            System.out.println("The Division Is:"+div);

            int gcd = gcd(num1, num2);
            System.out.println("Greatest Common Divisior Is:"+gcd);
        }
    }

    public static int Add(int a , int b){
            return a+b;
    }

    public static int Sub(int a , int b){
        return a-b;
    }

    public static int Mul(int a , int b){
        return a*b;
    }

    public static int Div(int a , int b){
        if(b==0){
            System.out.println("Cannot Divide By Zero!");
            return 0;
        }
        return a/b;
    }

    public static int gcd(int firstNumber , int secondNumber){
        int gcd = 1;
        int i = 2;
        int least = least(firstNumber, secondNumber);

        while(i<=least){
            if(firstNumber%i==0 && secondNumber%i==0)
            {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int firstNumber , int secondNumber){
        if(firstNumber<secondNumber){
            return firstNumber;
        }
        else{
            return secondNumber;
        }
    }
}