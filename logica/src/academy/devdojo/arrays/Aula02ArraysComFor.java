package academy.devdojo.arrays;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite as nota: " + (i +1));
            notas[i] = sc.nextDouble();

        }

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma = soma + notas[i];
        }
        soma = soma / notas.length;
        System.out.println("A sua media eh: " + soma);
    }
}
