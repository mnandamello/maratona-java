package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        String nome = "Maria Fernanda";
        int idade = 18;
        if (idade < 10) System.out.println("Oloco meu");
        //if (!nome) System.out.println("não tem nome"); -> isso nn funciona como no JS, o modo certo seria if(n == null || n.isBlank() ou n.isEmpty()

        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Pode beber!");
        }else {
            System.out.println("Não pode beber!");
        }

        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        }else {
            System.out.println("Categoria adulta");
        }

        //Operador Ternario: a? a : b -> a variavel em que o operador ternario for guardado tem q ser do mesmo tipo da sua resposta

        double salario = 5000;
        String mensagemDoar = "Vou doar 500";
        String mensagemNaoDoar = "Não tenho condições";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);


        double salarioAnual = 33000;
        double primeiraFaixa = 9.70/100;
        double segundFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;

        if (salarioAnual >= 0 &&  salarioAnual<= 34721){
            valorImposto = salarioAnual * primeiraFaixa;
            System.out.println("Vc deve pagar 1:" + valorImposto);
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundFaixa;
            System.out.println("Vc deve pagar 2: "+valorImposto);
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
            System.out.println("Vc deve pagar 3: "+valorImposto);
        }


        //Switch case -> aceita apenas char, int, byte, short, String, enum

        String role = "ADMIN";
        switch (role){
            case "ADMIN":
                System.out.println("Acesso total");
                break;
            case "USER":
                System.out.println("Acesso limitado");
                break;
            default:
                System.out.println("Acesso negado");
        }

    }
}
