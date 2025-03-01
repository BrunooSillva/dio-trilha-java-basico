public class ExemploForArray {
    public static void main (String[] args){
        String alunos [] = {"Joao" , "maria", "Pedro", "Paulo"};

        for (int x = 0; x < alunos.length; x ++){
            // o length é usado para que o for execute até a variavle x ser maior que a quantidade de indices no array
            System.out.println("O aluno da proxição x=" + x + " é o " + alunos[x]);
        }

        // forma abreviada

        for (String aluno : alunos){
            // neste for a variavel aluno recebe o nome que está em alunos durante cada execução
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
   
}
