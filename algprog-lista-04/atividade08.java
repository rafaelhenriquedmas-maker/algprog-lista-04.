import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o " + i + "º número: ");
            double numero = entrada.nextDouble();

            soma = soma + numero;
        }

        double media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        entrada.close();
    }
}