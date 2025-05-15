package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class ExtremamenteBasico_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        in.close();

        int X = A + B;

        System.out.println("X = " + X);
    }
}
