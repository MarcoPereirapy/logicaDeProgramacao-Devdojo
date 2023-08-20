package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner EntraDados = new Scanner(System.in);

        System.out.println("Digite o seu sexo abaixo: ");
        String sexo = EntraDados.next();
        System.out.println("Digite sua idade: ");
        int idade = EntraDados.nextInt();

        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            System.out.println("Sexo invalido digite M ou F");

        } else if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento Militar obrigatorio!");
        } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("Alstamento nao permitido!");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Voce deseja se alistar?");
        } else if (sexo.equalsIgnoreCase("F") && idade < 18) {
            System.out.println("Alistamento nao Permitido");
        }
        System.out.println("Fim do programa");
    }
}
