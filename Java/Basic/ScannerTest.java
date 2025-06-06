import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

                System.out.print("Enter a Name: ");
        String name = entrada.nextLine();
        System.out.print("Enter a Idade: ");
        int idade = entrada.nextInt();

        System.out.println("Seu nome é " + name + " Sua idade " + idade);
        entrada.close();
    }
}