import org.junit.jupiter.api.Test;

import java.util.Scanner;

/*
PMT = prestação
PV = valor presente no momento da contratação
i = taxa de juros
n = número de prestações
amort = amortização
saldo devedor = saldo após desconto da armotização no período
 */

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean continuar = true;

        while (continuar) {

            System.out.print("Digite valor inicial: ");
            Double pv = sc.nextDouble();

            System.out.print("Digite taxa de juros: ");
            Double i = sc.nextDouble();

            System.out.print("Digite número de parcelas: ");
            Integer n = sc.nextInt();


            TabelaPrice tabelaPrice = new TabelaPrice(pv, i, n);
            tabelaPrice.criarTabela();

            TabelaSAC tabelaSAC = new TabelaSAC(pv, i, n);
            tabelaSAC.criarTabela();

            if (tabelaPrice.totalPago > tabelaSAC.totalPago) {
                System.out.printf("Pela Price ficou R$%.2f mais caro \n\n", (tabelaPrice.totalPago - tabelaSAC.totalPago));
            } else {
                System.out.printf("Pela SAC ficou R$%.2f mais caro \n\n", (tabelaSAC.totalPago - tabelaPrice.totalPago));
            }

            continuar = false;

            System.out.print("Continuar? S ou N : ");
            sc.nextLine();
            String resposta = sc.nextLine();

            if (resposta.equals("S") || resposta.equals("SIM") || resposta.equals("Sim")|| resposta.equals("s") || resposta.equals("sim")) {
                continuar = true;
            }

        }
    }
}
