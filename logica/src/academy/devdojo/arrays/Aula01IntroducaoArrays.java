package academy.devdojo.arrays;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double[] notas = new double[4];

        notas[0] = 8.0;
        notas[1] = 3.0;
        notas[2] = 6.0;
        notas[3] = 3.5;

        System.out.println("Tamanho do Array: " + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
