import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i<10; i++){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num == 0){break;} else{sum = sum + num;}
        }
        System.out.println("The sum is: "+sum);



       

    }
}
