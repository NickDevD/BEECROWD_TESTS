package JAVA_BASICO.Problemas_Iniciante;

import java.util.Scanner;

public class Salario_1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int funcionario = in.nextInt();
        int horas = in.nextInt();
        double salhora = in.nextDouble();

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f%n",calculoSalario(horas, salhora));

    }
    public static double calculoSalario(int horas, double salarioHora){
        return horas * salarioHora;
    }
}
