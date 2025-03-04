import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       
        imprimindoSelecionados();
       
    }
    
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

    static double valorPretendido(){
        //criacao do metodo que retorna um valor double aleatorio
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

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
