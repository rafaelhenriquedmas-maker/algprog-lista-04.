import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        // Nome
        do {
            System.out.print("Digite seu nome: ");
            nome = entrada.nextLine();

            if (nome.length() <= 3) {
                System.out.println("Nome inválido! Deve ter mais de 3 caracteres.");
            }

        } while (nome.length() <= 3);

        // Idade
        do {
            System.out.print("Digite sua idade: ");
            idade = entrada.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida!");
            }

        } while (idade < 0 || idade > 150);

        // Salário
        do {
            System.out.print("Digite seu salário: ");
            salario = entrada.nextDouble();

            if (salario <= 0) {
                System.out.println("Salário inválido!");
            }

        } while (salario <= 0);

        entrada.nextLine();

        // Sexo
        do {
            System.out.print("Digite seu sexo (f/m): ");
            sexo = entrada.nextLine().toLowerCase();

            if (!sexo.equals("f") && !sexo.equals("m")) {
                System.out.println("Sexo inválido!");
            }

        } while (!sexo.equals("f") && !sexo.equals("m"));

        // Estado civil
        do {
            System.out.print("Digite seu estado civil (s/c/v/d): ");
            estadoCivil = entrada.nextLine().toLowerCase();

            if (!estadoCivil.equals("s") &&
                !estadoCivil.equals("c") &&
                !estadoCivil.equals("v") &&
                !estadoCivil.equals("d")) {

                System.out.println("Estado civil inválido!");
            }

        } while (!estadoCivil.equals("s") &&
                 !estadoCivil.equals("c") &&
                 !estadoCivil.equals("v") &&
                 !estadoCivil.equals("d"));

        System.out.println("\nInformações válidas!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);

        entrada.close();
    }
}