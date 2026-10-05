import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = entrada.nextLine();

            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Erro! A senha não pode ser igual ao nome de usuário.");
            }

        } while (senha.equals(usuario));

        System.out.println("Cadastro realizado com sucesso!");

        entrada.close();
    }
}