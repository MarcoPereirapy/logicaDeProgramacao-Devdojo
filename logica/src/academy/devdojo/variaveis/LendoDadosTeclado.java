package academy.devdojo.variaveis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LendoDadosTeclado {
    public static void main(String[] args) {
        Scanner lendoTeclado = new Scanner(System.in);

        System.out.println("Digita seu nome: ");
        String nome = lendoTeclado.next();
        System.out.println("Digite sua idade: ");
        int idade = lendoTeclado.nextInt();

        System.out.println("Bem vindo ao sistema " + nome + ":D");
        System.out.println(nome + " Sua idade eh: " + idade + " XD");
    }
}
