package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class ProdutoSimples_1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("PROD = " + prod(in.nextInt(), in.nextInt()));
        in.close();
    }

    public static int prod(int var1, int var2){
        return var1 * var2;
    }
}
