package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {

        //While

        int count = 0;
        while (count < 11){
            System.out.println(count);
            count++;
        }

        // do while -> vai executar pelo menos uma vez mesmo se a condição for falsa

        do {
            System.out.println("Dentro do do-while");
        }while (count < 10);

        //For

        for (int i = 0; i < 10; i++){
            System.out.println("Dentro do for " + i);
        }

        //Exercicio

        double n = 0;
        while (n <= 100) {
            if (n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }

        //Break

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) break;
            System.out.println(i);
        }

        //Exercicio 2

        double valorCarro = 35000;
        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) break;

            System.out.println("Parcela "+ parcela +" R$ "+valorParcela);

        }
    }
}
