public class Variaveis {
    public static void main(String[] args) {

        byte umByte = 124; // byte recebe valor de -128 até 127 - 1 byte
        short ano = 2025 ; // short recebe valor de -32.768 até 32.767 - 2 byte
        int idade = 25; // int é o mais usado para atribuição de valor inteiro - 4 byte
        long grandeValor = 57489312L ; //long recebe grandes valores - 8 byte

        float valor = 24F; // tipo primitivo de pode conter partes fracionarias - 4 byte
        double dois = 2; // tipo primitivo que pode conter partes fracionarias - 8 byte

        double salarioMinimo = 2.500; //ATENÇÃO quando o ponto(.) é usado o valor para separar decimal logo o valor atribuido para está variavel é 2.5 e não 2500
        double salarioMinimo2 = 2500.50; //forma correta para atribuir valores na casa dos milhares, esse erro pode aconter porque a linguagem está no padrão americano

        String nome = "Bruno"; // String serve para receber escritas de texto


        final double VALOR_DE_PI = 3.14 ; // usasse final na frente do tipo para declarar uma constante, um valor que não pode mudar
    }
}