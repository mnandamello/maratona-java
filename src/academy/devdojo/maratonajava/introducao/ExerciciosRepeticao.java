package academy.devdojo.maratonajava.introducao;

import java.util.List;

public class ExerciciosRepeticao {
    public static void main(String[] args) {

        //Exercicio 1:Filtre apenas os nomes que começam com a letra "a",Transforme esses nomes em maiúsculo e Colete em uma nova lista e imprima os nomes.

        List<String> nomes = List.of("ana", "joão", "maria", "carlos", "amanda", "renato");
        List<String> nomesComA = nomes.stream().filter(nome -> nome.contains("a")).map(String::toUpperCase).toList();
        System.out.println(nomesComA);

        //Exercicio 2: Crie uma variável chamada diaSemana com valor de 1 a 7, use switch pra imprimir

        int diaSemana = 5;
        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }

        //Exercicio 3: Imprima todos os números de 1 a 20 e diga se são pares ou ímpares.

        for (int i = 0; i <= 20 ; i++) {
            if (i%2 == 0){
                System.out.println(i + " É par!");
            }else {
                System.out.println(i + " É impar!");
            }

        }

        //Exercicio 4: Peça ao usuário uma senha, Enquanto a senha for incorreta, continue pedindo, Quando acertar, exiba "Acesso concedido!"

        /*
        Scanner scanner = new Scanner(System.in);

        String senhaCerta = "maria123";
        System.out.println("Informe sua senha: ");
        String senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhaCerta)){
            System.out.println("Senha incorreta, digite sua senha novamente: ");
            senhaDigitada = scanner.nextLine();
        }
        System.out.println("Acesso concedido");
        */

        //Exercicio 5: Imprimir todos os nomes com foreach

        String[] frutas = {"Banana", "Morango", "Melancia", "Mamão"};

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        //Exercicio 6: Somar todos os valores de um array

        int[] numeros = {10,15,20,25,30};
        int soma = 0;

        for (int numero : numeros){
            soma += numero;
        }
        System.out.println("Soma total: "+soma);


        //Exercicio 7: Contar quantas palavras começam com uma letra específica

        List<String> palavras = List.of("abacaxi", "banana", "ameixa", "morango", "amora");
        List<String> palavrarComA = palavras.stream().filter(palavra -> palavra.startsWith("a")).toList();
        int contador = 0;

        for (String palavra : palavrarComA){
            contador++;
            System.out.println(palavra);
        }
        System.out.println("Palavras que começam com 'a': "+contador);

        //Exemplos exercicio 7:
        /*
        List<String> palavras = Arrays.asList("abacate", "banana", "ameixa", "carro", "anjo");
        int contador = 0;

        for (String palavra : palavras) {
            if (palavra.toLowerCase().startsWith(letra)) { -> aqui eu ja 'filtro' no if
                contador++;
            }
        }


        List<String> palavras = Arrays.asList("abacate", "banana", "ameixa", "carro", "anjo");

        long count = palavras.stream()
                .filter(p -> p.toLowerCase().startsWith(letra))
                .count();
        */
    }
}
