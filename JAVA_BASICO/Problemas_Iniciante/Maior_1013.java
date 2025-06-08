package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Maior_1013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();;
        int B = in.nextInt();;
        int C = in.nextInt();

       int MAIOR = Math.max(A, Math.max(B, C));

        System.out.println(MAIOR + "eh o maior");

    }
}
