import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número: ");
        int num1 = terminal.nextInt();

        System.out.println("Digite o valor do segundo número: ");
        int num2 = terminal.nextInt();

        try{

            contar(num1, num2);

        }catch(InvalidParameterException Exception) {

        }

        terminal.close();
        
    }

    public static void contar(int num1, int num2) throws InvalidParameterException{
        if(num1> num2){
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }else{
            int contagem = num2 - num1;
            System.out.println("Iniciando contagem");
            for(int contador = 0; contador < contagem; contador++){
                System.out.println("Contagem de número " + (contador+1));
                System.out.println(num1);
                System.out.println(num2);
            }
            
        }
    }
}
