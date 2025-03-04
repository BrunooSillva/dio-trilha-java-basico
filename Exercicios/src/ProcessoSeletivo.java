import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"BRUNO", "PAULO", "FERNANDA", "LAYSA", "ANA"};
       for (String candidato : candidatos) {
            ligandoCandidato(candidato);//chamando o metodo ligandoCandidato e enviando o parametro do candidato atual 
       }
    }

    //metodo ligandoCandidato
    static void ligandoCandidato(String candidato){
        int tentativasRealizadas = 1;
        boolean atendeu = false;
        boolean continuarTentando = true;   
        do{
            atendeu = atender(); //atribuindo o valor do metodo atender a variavel atendeu
            continuarTentando = !atendeu; // continuarTentando recebe atendeu na sua forma negada, logo se atendeu for true a variavel recebe false, e vice-versa
            if(continuarTentando){
                //se continuarTentando for true, adiciona mais um na contagem de tentativas
                tentativasRealizadas++;
            }else{
                //se continuarTentando for false quer dizer que o candidato atendeu
                System.out.println("contato realizado com sucesso");
            }
        //aqui enquanto continuarTentando for true e tentativasRealizadas menor que 3 ele não entrará no loop
        }while(continuarTentando && tentativasRealizadas <3);{
            //quando uma das afirmações do while for falsa ele irá executar
            //se atendeu igual true vai executar o if
            if(atendeu){
                System.out.println("Conseguimo contato com o " + candidato + " na " + tentativasRealizadas + " tentativa");
            }else{
                //se atendeu for false executara o else
                System.out.println("Não conseguimos contato com o " + candidato + " atingiu o limite maximo de " + tentativasRealizadas + " tentativas");
            }
        }
    }

    // metodo auxiliar para gerar um valor booleano, se for igual a 1 será true
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    //metodo para imprimir os candidatos selecionados
    static void imprimindoSelecionados(){
        
        String [] candidatos = {"BRUNO", "PAULO", "FERNANDA", "LAYSA", "ANA"};

        //imprimindo
        System.out.println("imprimindo selecionados");
        for(int lista = 0; lista < candidatos.length; lista++){
            System.out.println("O candidato na posição n° " + (lista+1) + " foi selecionado " + candidatos[lista] );
        }
        

        //forma de imprimir abreviada com o for each
        for (String candidato : candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado");
        }
    }

    // metodo para selecionar os canidatos
    static void selecaoCandidatos(){
        // criando o array candidatos
        String [] candidatos = {"BRUNO", "PAULO", "FERNANDA", "LAYSA", "ANA", "EDNA", "JOAO", "VALERIA", "GUSTAVO", "MANUELA", "PEDRO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        //criando o loop while para selecionar os candidatos 
        // o loop vai funcionar enquanto candidatosSelecionados for menor que 5 e enquanto candidatoAtual for menor que a quantidade de candidatos no array candidatos 
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual]; //criando variavel candidato que recebe o array candidatos com o indice do candidatoAtual
            double salarioPretendido = valorPretendido();//usando o metodo criado para gerar valores aleatorios

            // imprimindo na tela em qual candidatos esta e qual seu salarioPretendido
            System.out.printf("O candidato %s solicitou um salario de %,.2f \n", candidato, salarioPretendido); 
            //criando o if para selecionarmos os candidatos
            if (salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado! \n", candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    //criacao do metodo que retorna um valor double aleatorio
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //metodo para analisar o salario predentido pelo candidato
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA"); 
        } else {
            System.out.println("AGUARDANDO O PROCESSO DOS DEMAIS CANDIDATOS");
        }


    }
}
