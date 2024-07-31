import java.util.Scanner;

public class DesafioUm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}