import java.util.Scanner; //Importando a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //todo: conhecer e importar a classe scanner;
        //Exibir as mensagens para nosso usuario;
        // obter pela classe scanner os valores digitados no terminal;
        //exibir a mensagem final;

        //Declrando as variaveis;

        int numeroConta = 0;
        String numeroAgencia = "";
        String nomeCliente = "";
        double saldo = 0d;

        //Criando a variavel scanner e atribuindo os metodos que estão na classe Scanner;
        Scanner scanner = new Scanner(System.in); 


        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt(); //Utilizando o scanner para ler um numero inteiro;

        System.out.println("Digite o número da agencia: ");
        numeroAgencia = scanner.next(); //Utilizando o scanner para ler a string numeroAgencia;

        scanner.nextLine(); /*Utilizando esse scanner apenas para ele armazenar a quebra de linha que o scanner.next() não lê, 
        assim evitando o erro de que o scanner.nextLine() leia essa quebra de linha e não deixe o usuario digitar o nome;*/

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();//Utilizando o scanner para ler o nome do cliente;

        System.out.println("Digite o seu saldo: ");
        saldo = scanner.nextDouble();//Utilizando scanner para ler o saldo;

        System.out.println("Olá " + nomeCliente + ", bem vindo, o número da sua conta é "+ numeroConta + " e sua agencia é " + numeroAgencia + 
        ", e seu saldo é de " + saldo + " reais.");//Printando todas as informações que o usuario digitou;

        scanner.close(); //Fechando a classe scanner;
    }
}
