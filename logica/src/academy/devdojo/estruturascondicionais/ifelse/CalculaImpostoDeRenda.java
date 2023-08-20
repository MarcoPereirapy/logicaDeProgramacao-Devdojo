package academy.devdojo.estruturascondicionais.ifelse;

public class CalculaImpostoDeRenda {
    public static void main(String[] args) { //Todo codigo precisa da main para a Jvm ler
        double salario = 2350; //Cria a variavel salario e atribui o valor de 3800.00

        if (salario <= 2112) { //Avalia se salario eh menor OU IGUAL, caso fosse verdade entraria no IF
            System.out.println("inseto");

        } else if (salario >= 2112.01 && salario <= 2826.65) { //Como temos mais de uma condicao a ser analisadas usamos o Else If
            System.out.println("Aliquota de 7,5%");

        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Aliquota de 15%");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Aliquota de 22.5%");

        } else {
            System.out.println("Aliquota de 27,5%");
        }
    }
}
