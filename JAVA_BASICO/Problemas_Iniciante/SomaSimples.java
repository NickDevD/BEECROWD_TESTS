package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();

    int soma = A + B;

    System.out.println("SOMA = "+soma);
    in.close();
    }
}
