package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;
/* Como usuário eu gostaria de  de ter um menu visual  que seja navegável através de números.
O menu deve ser exibido da seguinte forma

1. Calcular Imposto
2. Depositar Salário
3. Sair

O menu deve ficar disponível enquanto eu não digitar o número 3.
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
*/
public class Aula03Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        while (num != 3) {
            System.out.println("Escolha uma das 3 opcoes: 1- Calcular Imposto | 2 - Depositar salario | 3 - Sair");
            num = input.nextInt();
        }

    }
}
