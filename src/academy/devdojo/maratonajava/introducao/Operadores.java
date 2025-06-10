package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {

        //Operadores Aritiméticos: + - / *

        int n01 = 10;
        int n02 = 20; //se os 2 numeros são inteiros o resultado vai ser inteiro, se um deles for double ou float ai sim vai ter alteração

        var resultado1 = n01 - n02;
        var resultado2 = n01 + n02;
        double resultado3 = n01 / n02;
        var resultado4 = n01 * n02;


        //Operadores Relacionais: % <> <= >= != ==

        //O resto %, pode identificar se uma variavel é par ou impar, pq se o resto for 1 é impar e se for par é 0

        int resto = 21 % 3;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println(isDezMaiorQueVinte);

        //Operadores lógicos: or(||), and(&&), not (!)

        int idade = 35;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 7000;
        float valorPS5 = 5000;
        boolean isPossivelComprarPS5 = valorTotalContaCorrente >= valorPS5 || valorTotalContaPoupanca >= valorPS5;
        System.out.println("Posso Comprar um PS5? " + isPossivelComprarPS5);

        //Operadores de atribuição: =, +=, -=, *=, /=, %=

        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; // 1800
        bonus *= 2; //3600
        bonus /=  2; //1800
        bonus %= 2;
        System.out.println(bonus);

        /*Operadores : ++, -- -> se colocar os sinais antes da variavel eu ja atribuo o novo valor antes do programa fazer qualuqer cosia, agr se é colocado
        na frente  ele primeiro executa oq tiver q fazer com a variavel e depois adiciona, exemplo:
        int contador2 = 0;
        System.out.println(contador2++); -> aqui vai aparecer 0
        System.out.println(contador2); -> agr aqui aparece 1, pq o ++ foi executado depois de ser impresso
        System.out.println(++contador2); -> aqui ja seria 1
         */

        int contador = 0;
        contador ++;
        System.out.println(contador);
    }
}
