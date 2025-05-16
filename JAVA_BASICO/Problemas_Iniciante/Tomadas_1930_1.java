package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Tomadas_1930_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalTomadas = -3;

        int[] reguas = new int[4];

        for (int tomada = 0; tomada < 4; tomada++) {
            reguas[tomada] = in.nextInt();
            totalTomadas += reguas[tomada];
        }

        System.out.println(totalTomadas + " tomadas");
        in.close();
    }
}
