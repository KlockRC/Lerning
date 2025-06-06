import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter Number 1: ");
                int numb1 = sc.nextInt();
        System.out.print ("Enter Number 2: ");
                int numb2 = sc.nextInt();
        sc.close();
        int sum  = numb1 + numb2;
        System.out.println("The sum is: " + sum);
    }
}

