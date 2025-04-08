package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codProduto01 = in.nextInt();
        int numProdutos01 = in.nextInt();
        double valorUnitario01 = in.nextDouble();

        double total01 = numProdutos01 * valorUnitario01;

        int codProduto02 = in.nextInt();
        int numProdutos02 = in.nextInt();
        double valorUnitario02 = in.nextDouble();

        double total02 = numProdutos02 * valorUnitario02;

        double valorTotal = total01 + total02;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n ", valorTotal);


    }
}
