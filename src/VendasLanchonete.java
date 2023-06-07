
import java.util.Scanner;

public class VendasLanchonete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double totalVendido = 0;
        int quantidadeVendas = 0;

        System.out.println("Registre as vendas do dia (digite 0 para encerrar):");

        double valorVenda;
        do {
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = scanner.nextDouble();

            if (valorVenda != 0) {
                totalVendido += valorVenda;
                quantidadeVendas++;
            }
        } while (valorVenda != 0);

        System.out.printf("Total vendido: R$ %.2f ", totalVendido);

        if (quantidadeVendas > 0) {
            double mediaVendas = totalVendido / quantidadeVendas;
            System.out.printf("Média das vendas: R$ %.2f", mediaVendas);
        } else {
            System.out.println("Nenhuma venda registrada.");
        }

    }
}

