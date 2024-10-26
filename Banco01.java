package projeto01;
import java.util.Scanner;
import java.util.Locale;
public class Banco01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String nome = "Tallis Teixeira" ;
        String tipoConta = "Corrente";
        double saldoConta = 1000.0;

        System.out.println("--------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.printf("Saldo Inicial: R$ %.2f%n", saldoConta);
        System.out.println("--------------------------------");

        String menu = """
                ** Qual e a sua opção? 
                1 - Consultar Valor
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;
        int menuOpcao = 0;

        while (menuOpcao != 4){
            System.out.println(menu);
            menuOpcao = sc.nextInt();

            if (menuOpcao == 1){
                System.out.printf("R$ %.2f%n", saldoConta);
            }
            else if (menuOpcao == 2) {
                System.out.println("Informe o valor que quer receber: ");
                double valorReceber = sc.nextDouble();
                saldoConta += valorReceber;
                System.out.printf("Saldo atualizado R$ %.2f%n", saldoConta);
            }
            else if (menuOpcao == 3){
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferir = sc.nextDouble();
                if (valorTransferir > saldoConta){
                    System.out.println("Não a saldo para realizar essa transferencia");
                }
                else {
                    saldoConta -= valorTransferir;
                    System.out.printf("Saldo atualizado R$ %.2f%n", saldoConta);
                }
            }
            else if (menuOpcao != 4){
                System.out.println("Opção invalida");
            }
        }
    }
}
