import java.util.Scanner;

public class CalculatorIntel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter Number 1: ");
        int numb1 = sc.nextInt();
        System.out.print ("Enter Number 2: ");
        int numb2 = sc.nextInt();
        System.out.print ("Enter Operator (+, -, *, /): ");
        String op = sc.next();
        sc.close();
        if (op.equals("+")) {
            int sum  = numb1 + numb2;
            System.out.println("The sum is: " + sum);
        }
        else if (op.equals("-")) {
            int sub  = numb1 - numb2;
            System.out.println("The sub is: " + sub);
        }
        else if (op.equals("*")) {
            int mul  = numb1 * numb2;
            System.out.println("The mul is: " + mul);
        } else if (op.equals("/")) {
            if (numb1 == 0) {
                System.out.println("Division is impossible");
            }
            else if (numb2 == 0) {
                System.out.println("The division is Impossible");
            }
            else {
                int div  = numb1 / numb2;
                System.out.println("The Div is: " + div);
            }
        }
    }
}
