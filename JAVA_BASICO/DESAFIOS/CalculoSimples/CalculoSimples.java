package JAVA_BASICO.DESAFIOS.CalculoSimples;

import java.util.Scanner;
import static JAVA_BASICO.DESAFIOS.CalculoSimples.Produto.formatarSaida;
import static JAVA_BASICO.DESAFIOS.CalculoSimples.Produto.lerProduto;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Produto produto1 = lerProduto(in);
        Produto produto2 = lerProduto(in);

        double valorTotal = produto1.calcularValorTotal() + produto2.calcularValorTotal();

        System.out.println(formatarSaida(valorTotal));

    }
}
