package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroFuncionarioOr {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in); //Cria um leitor de dados do teclado

        System.out.println("LOGIN: ");
        String nome = inputData.next();  //aqui a entrada de dados vai ser atribuida a varivel nome

        if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("") || nome.equalsIgnoreCase("admnistrador")) { //No java devo usar equals toda vez que for comparar strings
            System.out.println("USUARIO INVALIDO!"); //caso alguma das alternativas acima seja verdadeira aqui vai executar
        } else {
            System.out.println(nome + " Cadastrado com sucesso!");
        }
    }
}
