package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner entraDados = new Scanner(System.in);

        System.out.println("Ola qual tipo de conta vc quer abrir?|| 1- Conta Poupanca | 2- Conta Corrente | 3- Conta investimento");

        int opcao = entraDados.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Conta poupanca: 0.05% de Juros");
                break;
            case 2:
                System.out.println("Conta corrente: 0.02% de Juros");
                break;
            case 3:
                System.out.println("Conta investimento: 0.1% de Juros");
                break;
            default:
                System.out.println("Por favor escolha um tipo de conta valida!");
        }
    }
}
