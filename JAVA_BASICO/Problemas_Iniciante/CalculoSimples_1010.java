package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class CalculoSimples_1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codProduto01 = in.nextInt();
        int numProduto01 = in.nextInt();
        double valorUnitario01 = in.nextDouble();

        double total01 = numProduto01 * valorUnitario01;

        int codProduto02 = in.nextInt();
        int numProduto02 = in.nextInt();
        double valorUnitario02 = in.nextDouble();

        double total02 = numProduto02 * valorUnitario02;

        double valorTotal = total01 + total02;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n ", valorTotal);


    }
}
