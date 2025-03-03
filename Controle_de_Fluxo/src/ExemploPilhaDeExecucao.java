public class ExemploPilhaDeExecucao{
    public static void main(String[] args){
        System.out.println("Iniciando metodo main.");
        a();
        System.out.println("Finalizando metodo main");
    }

    public static void a(){
        System.out.println("Iniciando metodo a");
        b();
        System.out.println("Finalizando metodo a");
    }

    public static void b(){
        System.out.println("Iniciando metodo b");
        for (int numero = 0; numero <= 4; numero ++){
            System.out.println(numero);
       }
       c();
       System.out.println("Finalizando metodo b");
    }

    public static void c(){
        System.out.println("Iniciando metodo c");
        System.out.println("Finalizando metodo c");
    }
}