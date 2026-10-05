import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        if (numero1 < numero2) {

            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }

        } else {

            for (int i = numero2; i <= numero1; i++) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}