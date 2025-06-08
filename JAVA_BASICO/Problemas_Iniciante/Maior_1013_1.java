package JAVA_BASICO.Problemas_Iniciante;

public class Maior_1013_1 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 7;
        int d = 10;
        int maior;

        // Outra forma de verificarmos o maior número é com a condicional if-else
        if (a>= b && a>=c){
            maior = a;
        } else if (b >= a && b >= c) {
            maior = b;
        }else if (c >= b && c >= d){
            maior = c;
        }else {
            maior = d;
        }

        System.out.println(maior);
    }
}
