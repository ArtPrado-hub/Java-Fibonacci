
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner termos = new Scanner(System.in);

        System.out.println("Quantos termos da sequência de fibonacci você deseja exibir?");
        int limite = termos.nextInt();

        int n0 = 0;
        System.out.println(n0);
        int n1 = 1;
        System.out.println(n1);

        for (int i = 2; i < limite ; i++) {
            int n2 = n0 + n1;
            System.out.println(n2);
            n0 = n1;
            n1 = n2;

        }
        termos.close();
    }
}

