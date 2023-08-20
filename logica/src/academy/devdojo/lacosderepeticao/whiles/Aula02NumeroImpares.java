package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02NumeroImpares {
    public static void main(String[] args) {
        Scanner entraDados = new Scanner(System.in);

        System.out.println("Digite um numero que irei verificar todos o numeros impares");

        int num = entraDados.nextInt();

        while (num >= 0) {
            if (num%2 != 0) {
                System.out.println(num);
            }
            num = num - 1;
        }

    }


}
