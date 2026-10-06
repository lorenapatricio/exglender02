import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        double soma = 0;

        System.out.println("Digite o valor de n");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            soma = soma + Math.pow(i, i);
        }

        System.out.println(soma);
        scanner.close();    
    }
}
