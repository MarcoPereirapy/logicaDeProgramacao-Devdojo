package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {

        Scanner LendoDados = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = LendoDados.next();

        System.out.println("Otimo " + nome + " Agora digite sua idade: ");
        short idade = LendoDados.nextShort();

        if (idade <= 10 ) {
            System.out.println(nome + " Participara da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participara da categoria Juvenil");

        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participara da categoria Pre-Adulto");

        } else {
            System.out.println(nome + " Participara da categoria Adulto");
        }
    }
}
