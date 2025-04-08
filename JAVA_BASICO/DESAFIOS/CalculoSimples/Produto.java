package JAVA_BASICO.DESAFIOS.CalculoSimples;

import java.util.Scanner;

public class Produto {
    int cod;
    int qtd;
    double valorUnitario;

    public Produto(int cod, int qtd, double valorUnitario){
        this.cod=cod;
        this.qtd=qtd;
        this.valorUnitario=valorUnitario;
    }

    public double calcularValorTotal(){
        return qtd * valorUnitario;
    }

    public static Produto lerProduto(Scanner in){
        int cod = in.nextInt();
        int qtd = in.nextInt();
        double valorUnitario = in.nextDouble();
        return new Produto(cod, qtd, valorUnitario);
    }

    public static String formatarSaida(double valorTotal) {
        return String.format("VALOR A PAGAR: R$ %.2f%n", valorTotal);
    }
}
