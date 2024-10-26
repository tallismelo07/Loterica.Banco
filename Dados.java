package projeto01;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Dados {
    String nomePessoa;
    String tipoConta;
    double saldoConta;

    public void capturaDados() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e o seu nome: ");
        nomePessoa = scanner.nextLine();
        System.out.println("Qual e o seu tipo de conta: ");
        tipoConta = scanner.nextLine();
        System.out.println("Qual e o seu saldo atualmente: ");
        saldoConta = scanner.nextDouble();
    }

    public double opcaoMenu() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String menu = """
                ** Qual e a sua opção? 
                1 - Consultar Valor
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;
        int menuOpcao = 0;

        while (menuOpcao != 4) {
            System.out.println(menu);
            menuOpcao = sc.nextInt();

            if (menuOpcao == 1) {
                System.out.printf("R$ %.2f%n", saldoConta);
            } else if (menuOpcao == 2) {
                System.out.println("Informe o valor que quer receber: ");
                double valorReceber = sc.nextDouble();
                saldoConta += valorReceber;
                System.out.printf("Saldo atualizado R$ %.2f%n", saldoConta);
            } else if (menuOpcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferir = sc.nextDouble();
                if (valorTransferir > saldoConta) {
                    System.out.println("Não a saldo para realizar essa transferencia");
                } else {
                    saldoConta -= valorTransferir;
                    System.out.printf("Saldo atualizado R$ %.2f%n", saldoConta);
                }
            } else if (menuOpcao != 4) {
                System.out.println("Opção invalida");
            }
        }
        return menuOpcao;
    }
}

