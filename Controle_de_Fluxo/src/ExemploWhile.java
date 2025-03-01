import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args){
        double mesada = 50.0;
        int quantidadeDoce = 0;


        while(mesada > 1){
            double valorDoce = valorAleatorio();
            System.out.printf("Doce do valor %,.2f adicionado no carrinho \n", valorDoce);
            mesada = mesada - valorDoce;
            quantidadeDoce += 1;

        }
        System.out.printf("Mesada: %,.2f \n", mesada);
        System.out.println("Bruno gastou toda sua mesada em " + quantidadeDoce + " doces");
    }

    public static double valorAleatorio(){
        //criando o metodo valorAleatorio para gerar o valor dos doces;
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
