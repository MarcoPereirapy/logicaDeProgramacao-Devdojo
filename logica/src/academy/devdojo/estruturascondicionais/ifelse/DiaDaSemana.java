package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner entraDados = new Scanner(System.in);
        System.out.println("Ola digite o numero correspondente ao dia: ");
        int num = entraDados.nextInt();

        if (num == 1) {
            System.out.println("Segunda-feira");
        } else if (num == 2) {
            System.out.println("Terca-Feira");
        } else if (num == 3) {
            System.out.println("Quarta-Feira");
        } else if (num == 4) {
            System.out.println("Quinta-Feira");
        } else if (num == 5) {
            System.out.println("Sexta-Feira");
        } else if (num == 6) {
            System.out.println("Sabadaco kassinooo");
        } else if (num == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia invalido!");
        }
    }
}
