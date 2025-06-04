package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Esfera_1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;

        double R = in.nextDouble();

        double volume = (4/3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
