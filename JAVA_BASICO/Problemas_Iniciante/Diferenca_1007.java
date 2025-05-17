package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Diferenca_1007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Va, Vb, Vc, Vd;
        Va = in.nextInt();
        Vb = in.nextInt();
        Vc = in.nextInt();
        Vd = in.nextInt();

        diferenca(Va,Vb,Vc,Vd);

    }
    public static void diferenca(int a, int b, int c, int d){
        int dif = (a*b-c*d);
        System.out.println("DIFERENCA = " + dif);
    }
}
