package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class SalarioComBonus_1009_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome = in.next();
        double salarioFixo = in.nextDouble();
        double totalVendas = in.nextDouble();

        double comissao = salarioFixo + (totalVendas*0.15);
        if (totalVendas != 0){
            System.out.printf("TOTAL = R$ %.2f%n", comissao);
        }else {
            System.out.printf("TOTAL = R$ %.2f%n",salarioFixo);
        }
        in.close();
    }
}
