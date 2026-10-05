import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = entrada.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! Digite novamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);

        entrada.close();
    }
}