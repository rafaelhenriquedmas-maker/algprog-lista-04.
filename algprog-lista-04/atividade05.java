import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String continuar;

        do {

            double paisA;
            double paisB;
            double crescimentoA;
            double crescimentoB;

            // População A
            do {
                System.out.print("Digite a população do país A: ");
                paisA = entrada.nextDouble();

                if (paisA <= 0) {
                    System.out.println("A população deve ser maior que zero.");
                }

            } while (paisA <= 0);

            // População B
            do {
                System.out.print("Digite a população do país B: ");
                paisB = entrada.nextDouble();

                if (paisB <= 0) {
                    System.out.println("A população deve ser maior que zero.");
                }

            } while (paisB <= 0);

            // Crescimento A
            do {
                System.out.print("Digite a taxa de crescimento do país A (%): ");
                crescimentoA = entrada.nextDouble();

                if (crescimentoA <= 0) {
                    System.out.println("A taxa deve ser maior que zero.");
                }

            } while (crescimentoA <= 0);

            // Crescimento B
            do {
                System.out.print("Digite a taxa de crescimento do país B (%): ");
                crescimentoB = entrada.nextDouble();

                if (crescimentoB <= 0) {
                    System.out.println("A taxa deve ser maior que zero.");
                }

            } while (crescimentoB <= 0);

            crescimentoA = crescimentoA / 100;
            crescimentoB = crescimentoB / 100;

            int anos = 0;

            while (paisA < paisB) {

                paisA = paisA + (paisA * crescimentoA);
                paisB = paisB + (paisB * crescimentoB);

                anos++;
            }

            System.out.println("\nSerão necessários " + anos + " anos.");

            entrada.nextLine();

            System.out.print("Deseja repetir? (s/n): ");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        entrada.close();
    }
}