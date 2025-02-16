public class MinhaClasse {
    public static void main (String [] args) {
        String nome = "Bruno";
        String sobrenome = "Luna";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome){
        return "Nome completo: " + nome.concat(" ").concat(sobrenome);
    }
}