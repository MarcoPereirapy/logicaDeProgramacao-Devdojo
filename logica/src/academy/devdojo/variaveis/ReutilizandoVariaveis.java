package academy.devdojo.variaveis;

public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        float Wage = 2500;
        float thirteenPercentWage = 30;
        float fifteenPercentWage = 15;
        float fivePercentWage = 5;

        float result = thirteenPercentWage * (Wage/100);
        System.out.println("30% eh igual a: " + result);

        result = fifteenPercentWage * (Wage/100);
        System.out.println("15% eh igual a: " + result);

        result = fivePercentWage * (Wage/100);
        System.out.println("5% eh igual a: " + result);



    }
}
