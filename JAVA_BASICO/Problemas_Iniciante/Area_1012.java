package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Area_1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double pi = 3.14159;

        double aTrianguloRetangulo = (A * C) / 2;
        double aCirculo = pi * Math.pow(C, 2);
        double aTrapezio = ((A + B) * C) / 2;
        double aQuadrado = Math.pow(B, 2);
        double aRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", aTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", aCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", aTrapezio);
        System.out.printf("QUADRADO: %.3f%n", aQuadrado);
        System.out.printf("RETANGULO: %.3f%n", aRetangulo);

    }
}
