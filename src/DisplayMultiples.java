import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = sc.nextInt();
       for (int i = 0; i<=12; i++){
           System.out.println(num+"x"+i+" = "+num*i);
       }
    }

}
