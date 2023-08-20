package academy.devdojo.lacosderepeticao.whiles;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Aula02Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma das opcoes: ");
        System.out.println("1-Adcionar | 2-Pesquisar | 3-Excluir");
        int num = input.nextInt();
        while (num != 0) {
            System.out.println("Escolha uma das opcoes: ");
            System.out.println("1-Adcionar | 2-Pesquisar | 3-Excluir");
        }
    }
}
