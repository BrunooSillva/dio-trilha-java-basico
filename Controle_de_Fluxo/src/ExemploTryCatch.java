import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {
    
    public static void main(String[] args){
        //criando o objeto scanner
        try{
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("Digite seu nome: ");
         String nome = scanner.next();

         System.out.println("Digite seu sobrenome: ");
         String sobrenome = scanner.next();

         System.out.println("Digite sua idade: ");
         int idade = scanner.nextInt();

         System.out.println("Digite sua altura: ");
         double altura = scanner.nextDouble();

         //imprimindo informações fornecidas pelo usuario
         System.out.printf("Seu nome é %s %s \n", nome.toUpperCase(), sobrenome.toUpperCase());
         System.out.println("Sua idade é " + idade);
         System.out.println("Sua altura é " + altura);

         scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura devem estar em formato de número."); 
            //exceção mostrada sobre o erro se as variaveis idade e altura não forem digitados números.
        }
    }
}
