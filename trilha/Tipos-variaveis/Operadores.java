
public class Operadores {
    public static void main(String[] args) {
        /*
         Operadores aritmeticos:
         + Soma
         - Subtração
         * Multiplicação
         / Divisão
         % modulo

         Operadores relacionais:
         == igual a
         != diferente de
         > maior que
         >= maior ou igual
         < menor que
         <= menor ou igual

         Operadores Lógicos:
         && operador logico E
         || operador logico OU
        */

        int soma = 15 +10;
        int subtracao = 5 - 2;
        int multiplicacao = 5 * 2;
        int divisao = 12 / 2;
        int modulo = 18 % 3;
        double resultado = (10 * 2) + (3 - 2);

        System.out.println("Soma: "+ soma);
        System.out.println("Subtração: "+ subtracao);
        System.out.println("Multiplicação: "+ multiplicacao);
        System.out.println("Divisão: "+ divisao);
        System.out.println("Modulo: "+ modulo);
        System.out.println("Resultado: "+ resultado);

        int numero = 5; //Atribuição do número 5 a variavel
        System.out.println("Imprime numero na forma negativa: " + - numero); //Aqui estamos printando o 5 na forma negativa
        System.out.println("Imprime a variavel numero: " + numero); //Aqui estamos printando a variavel numero e ela continua com 5 positivo

        numero = - numero; //Aqui estamos fazendo a variavel numero converter para negativa
        System.out.println("Aqui o valor atribuido a variavel está convertido para negativo: " + numero);

        numero = numero * -1; //Aqui estamos fazendo com que a variavel numero que agora está negativa volte a ser positiva
        System.out.println("Aqui o valor negativo atribuido foi convertido novamente para positivo: " + numero);

        // Incremento

        System.out.println( "Incremento foi feito apos o print: " + numero ++); //Neste caso o incremento é feito depois de imprimir a variavel, logo aqui será 5
        System.out.println("Numero com o incremento: " + numero); // Aqui será 6
        System.out.println( "Incremento feito antes de imprimir o numero: " + ++ numero); //Aqui o incremento sera feito antes de imprimir a variavel então será 7

        System.out.println( "Decremento feito apos imprimir o numero: " + numero --); //Neste caso o decremento é feito depois de imprimir a variavel, logo aqui será 7
        System.out.println("Numero com o decremento: " + numero); // Aqui será 6
        System.out.println("Decremento feito antes de imprimir o numero: " + -- numero); //Aqui o decremento sera feito antes de imprimir a variavel então será 5

        boolean variavel = true;

        System.out.println(!variavel); //imprime a variavel convertida, logo sera false
        System.out.println(variavel); //variavel definida como true

        variavel = !variavel; //Aqui convertemos definitivamente a variavel para false
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 5;
        String decisao = a == b ? "verdade" : "falso"; /*Está condição funciona como um IF ELSE, se a condição verdadeira imprime o que está depois
        do ponto de interrogação, se condição falsa imprime o que está depois dos dois pontos*/
        System.out.println("Comparando se variavel a é igual variavel b: " + decisao);

        String nomeUm = "Bruno";
        String nomeDois = new String("Bruno");

        System.out.println(nomeUm == nomeDois); //Aqui sera falso
        System.out.println(nomeUm.equals(nomeDois)); //Aqui será true porque ele está comparando conteudos

        boolean condicaoUm = true;
        boolean condicaoDois = false;
        if (condicaoUm && condicaoDois){
            System.out.println("Os dois valores são verdadeiros");//comparando se as duas condições é verdadeira
        }
        if (condicaoUm || condicaoDois){
            System.out.println("Uma das condições é verdadeira");//comparando se uma das duas condições é verdadeira
        }

        System.out.println("FIM");
    }
}
