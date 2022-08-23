import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

         Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
         
        System.out.print("Divisors of " + num+" "+ "="+" " );

        for (int i = 1; i < num; i++) { //i is the counter
            if (num % i != 0) { //if the number / counter is odd, it is skipped
                continue;
            }
            System.out.print(i + " , ");
        }
    }
}
