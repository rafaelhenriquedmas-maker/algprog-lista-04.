public class atividade04 {
    public static void main(String[] args) {

        double paisA = 80000;
        double paisB = 200000;

        double crescimentoA = 0.03;
        double crescimentoB = 0.015;

        int anos = 0;

        while (paisA < paisB) {

            paisA = paisA + (paisA * crescimentoA);
            paisB = paisB + (paisB * crescimentoB);

            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos.");
        System.out.println("População A: " + paisA);
        System.out.println("População B: " + paisB);
    }
}