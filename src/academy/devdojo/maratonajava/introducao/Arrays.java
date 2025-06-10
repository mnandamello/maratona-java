package academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 21;
        idades[2] = 30;

        //Formas de declarar um array
        int[] idades2 = new int[]{1,2,3};
        int[] idades3 = {1,2,3};

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        //jeito mais simples com foreach
        for (int idade : idades){
            System.out.println(idade);
        }

        //Arrays Multidimensionais

        /*
        1,2,3 alunos
        10,9,8 notas
        * */

        //int[][] dias = new int[12][];

        double[][] notas = {
                {9.0, 5.0, 8.5},
                {10.0, 5.5, 3.4},
                {9.7, 10.0, 7.8}
        };

        for (int i = 0; i < notas.length; i++) { //aqui eu entro no primeiro quadrado (aluno 1)
            for (int j = 0; j < notas[i].length; j++) { //aqui entro no array das notas do aluno 1
                System.out.println("Aluno " + (i+1) + " - Nota " + (j+1) + ": " + notas[i][j]);
            }
        }

        //Percorrendo com o foreach
        for (double[] aluno: notas){
            for (double nota : aluno){
                System.out.println(nota);
            }
        }

    }
}
