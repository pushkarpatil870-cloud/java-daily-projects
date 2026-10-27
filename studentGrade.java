
import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Welcome To Student Grade Calculator");

            int total = 0;
            int i = 1;
            while(i<=5){
                System.out.print("Sub"+i+":");
                int mark = sc.nextInt();
                total = total+mark;
                i++;
            }

            double percentage = (total/500.0)*100;
            System.out.println("Total Mark:"+total);
            System.out.println("Percentage:"+percentage);

            if(percentage>=90){
                System.out.println("A Grade");
            }
            else if(percentage>=75){
                System.out.println("B Grade");
            }
            else if(percentage>=60){
                System.out.println("C Grade");
            }
            else{
                System.out.println("Fail");
            }
        }
    }  
}
