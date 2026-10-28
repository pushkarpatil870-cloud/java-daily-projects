import java.util.Random;
import java.util.Scanner;

public class numberGussing {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Random rand = new Random();
            int secret = rand.nextInt(101);
            int attempts = 0;

            while(true){
                System.out.println("Guess No Between (1-100):");
                int guess = sc.nextInt();
                attempts++;

                if(guess==secret){
                    System.out.println("Correct Attempt:");
                }
                else if(guess>secret){
                    System.out.println("Too High!");
                }
                else{
                    System.out.println("Too Low!");
                }
                System.out.println("Total Attempt:"+attempts);
            }
        }
    }
    
}
