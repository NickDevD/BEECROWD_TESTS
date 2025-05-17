package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Tomadas_1930 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T1 = in.nextInt();
        int T2 = in.nextInt();
        int T3 = in.nextInt();
        int T4 = in.nextInt();
        in.close();

        int totalAparelhos = (T1-1) + (T2-1) + (T3-1) + T4;

        System.out.println(totalAparelhos + " aparelhos");

    }
}
