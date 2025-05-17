package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Media02_1006 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        media(in.nextDouble(), in.nextDouble(), in.nextDouble());

    }
    public static void media(double v1, double v2, double v3){
        double media = ((v1*2) +  (v2*3) + (v3*5)) / 10;
        System.out.printf("MEDIA = %.1f%n",media);
    }
}
