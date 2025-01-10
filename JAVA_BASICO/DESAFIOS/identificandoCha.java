package JAVA_BASICO.DESAFIOS;

import java.util.Scanner;

public class identificandoCha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Inserir Resposta Correta
        int respostaCorreta = in.nextInt();

        // Inserir as respostas do participantes
        int[] respostas = new int[5];
        for (int i = 0; i < 5; i++) {
            respostas[i] = in.nextInt();
        }

        // Contar os acertos
        int acertos = 0;
        for (int res:respostas) {
            if (res == respostaCorreta){
                acertos++;
            }
        }
        // Imprimir o total de acertos
        System.out.println(acertos);
    }
}
