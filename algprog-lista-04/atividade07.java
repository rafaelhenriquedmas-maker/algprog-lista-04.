import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maior = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();

            if (i == 1 || numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

        entrada.close();
    }
}