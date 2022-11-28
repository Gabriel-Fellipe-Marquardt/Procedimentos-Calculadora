import java.util.Scanner;

public class calculadora {
    static double numero1, numero2;
    static int opcao = 1;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o primeiro valor: ");
        numero1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        numero2 = scan.nextDouble();
        while (opcao > 0 && opcao <= 4) {
            System.out.println("====== Calculadora v10.0======");
            System.out.println("\t1 - Adição\n\t2 - Subtração\n\t3 - Divisão\n\t4 - Multiplicação\n\t0 - Sair");
            System.out.println("==============================\n> ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:

                    adicao(numero1, numero2);
                    break;

                case 2:

                    subtracao(numero1, numero2);
                    break;

                case 3:

                    divisao(numero1, numero2);
                    break;

                case 4:

                    multiplicacao(numero1, numero2);
                    break;

            }
        }

    }

    static void adicao(double numero1, double numero2) {
        System.out.println(numero1 + numero2);
    }

    static void subtracao(double numero1, double numero2) {
        System.out.println(numero1 - numero2);
    }

    static void divisao(double numero1, double numero2) {
        System.out.println(numero1 / numero2);
    }

    static void multiplicacao(double numero1, double numero2) {
        System.out.println(numero1 * numero2);
    }
}
