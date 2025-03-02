import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args){
        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocando");//vai executar essa linha de comando até que a condição do while seja true
        }while(tocando());
        System.out.println("Alo!!!");
        

    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1; //aqui gera um numero aleatorio até 3, se o numero for 1 então se torna true
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
