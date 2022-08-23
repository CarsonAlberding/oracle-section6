import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        int valid_pin = 3223;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pin number: ");
        int pin = sc.nextInt();
        while (pin >= 0){
            if (pin != valid_pin){
                System.out.print("Try again: ");
                pin = sc.nextInt();
            } else{break;}
        }

        sc.close();
        System.out.println("Success! You now have access to your account.");

        
    }
}
