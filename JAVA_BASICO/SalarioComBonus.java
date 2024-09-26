package JAVA_BASICO;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        double salario,totalVendas, comissao;

        System.out.print("Informe o nome do Vendedor: ");
        nome = in.nextLine();
        System.out.print("Informe o salário fixo do vendedor: ");
        salario = in.nextDouble();
        System.out.print("O total em vendas realizadas pelo vendedor foi? ");
        totalVendas = in.nextDouble();

        comissao = salario + (totalVendas*0.15);

        if (totalVendas != 0) {
            System.out.printf("TOTAL = R$ %.2f", comissao);
        }else {
            System.out.printf("TOTAL = R$ %.2f", salario);
        }
        in.close();
    }
}
