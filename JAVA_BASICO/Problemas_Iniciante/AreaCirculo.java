package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double area;
        double n = 3.14159;
        double raio = in.nextDouble();

        area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);
        in.close();

        /*
        A função Math.Pow é uma função que calcula potências em java.
        Ela recebe dois números como parâmetros: a base (b) e o expoente (e).
        Ela retorna um número do tipo double que é o resultado da potência.
         */
    }
}
