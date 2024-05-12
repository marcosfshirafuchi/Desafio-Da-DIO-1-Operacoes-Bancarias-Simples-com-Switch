import java.util.Scanner;

public class SimulacaoBancaria {
    /**
     * <h1>Condições, Loops e Exceções na Prática com Java</h1>
     * Desafio de código 1 / 5  da DIO - Operações Bancárias Simples com Switch
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   01/05/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch(opcao){
                case 1:
                    double saldoAtual = scanner.nextDouble();
                    saldo+=saldoAtual;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado >saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo-=valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    return;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}