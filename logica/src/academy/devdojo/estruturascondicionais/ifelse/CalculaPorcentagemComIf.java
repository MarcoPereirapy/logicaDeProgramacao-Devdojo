package academy.devdojo.estruturascondicionais.ifelse;//public class academy.devdojo.estruturascondicionais.ifselse.CalculaPorcentagemComIf {
//    public static void main(String[] args) {
//        float salario = 4500;
//        if (salario > 4500) {
//            float percentage = 30;
//            float wagePercentage = (percentage / 100) * salario;
//            System.out.println("A porcentagem de " + percentage + "%" + " de " + salario + "Equivale a : " + wagePercentage);
//
//        } else {
//            float percentage15 = 15;
//            float wagePercentage1 = (percentage15 / 100 * salario);
//            System.out.println("A porcentagem de " + percentage15 + "%" + " de " + salario + "Equivale a : " + wagePercentage1);
//        }
//    }
//}


public class CalculaPorcentagemComIf {
    public static void main(String[] args) {
        float salario = 4400;
        float resultado = 0f;

        if (salario > 4500) {
            resultado = 0.3F * salario;
            System.out.println("30%: " + resultado);
        } else {
            resultado = 0.15F *salario;
            System.out.println("15%: " + resultado);
        }
    }
}
