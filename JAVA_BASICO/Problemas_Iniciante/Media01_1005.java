package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Media01_1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v1 = in.nextDouble();
        double v2 = in.nextDouble();

        System.out.printf("MEDIA = %.5f%n",media(v1,v2));

        in.close();
    }
    public static double media(double var1, double var2){
        double p1 = 3.5;
        double p2 = 7.5;
        return (var1*p1 + var2*p2) / (p1+p2);
    }
}
