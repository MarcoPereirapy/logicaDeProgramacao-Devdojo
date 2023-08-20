package academy.devdojo.lacosderepeticao.whiles;
/* Apresentar ao usuário uma tela solicitando um login e depois uma senha,

 * o usuário e senha corretos devem estar armazenados em constantes no seu programa.

 * Se o usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO,

 * caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha,

 * essa condição deve-se repetir até que o usuário acerte a combinação.

 */

import javax.script.ScriptEngine;
import java.util.Scanner;

public class Aula04SistemaLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String user = "Admin";
        int senha = 1234;
        int validador = 0;

        while (validador == 0) {
            System.out.println("LOGIN: ");
            user = input.next();
            System.out.println("Senha: ");
            senha = input.nextInt();

            if (senha == 1234 && user.equalsIgnoreCase("admin")) {
                System.out.println("ACESSO CONCEDIDO");
                validador = validador + 1;
            } else {
                System.out.println("ACESSO NEGADO");
            }

        }
    }
}
