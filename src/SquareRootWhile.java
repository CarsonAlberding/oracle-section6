import java.util.Scanner;
import java.lang.Math;

public class SquareRootWhile {
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Type a non-negative integer: ");
	    int number = console.nextInt();
        while (number < 0){
            System.out.print("Type a non-negative integer: ");
            number = console.nextInt();
        }
        System.out.println("The square root of "+number+" is "+Math.sqrt(number));
   
    }
    
}
