public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); //Nessa linha estamos atribuindo o objeto SmartTv para a variavel smartTv.

        System.out.println("A TV está ligada? " + smartTv.ligada);//Aqui estamos printando o valor da variavel ligada que está na classe SmartTv.
        System.out.println("O canal que a TV está é : " + smartTv.canal);
        System.out.println("O volume da TV é: " + smartTv.volume);

        smartTv.mudarCanal(25);//Aqui estamos alterando o valor da variavel Canal.
        System.out.println("O canal que a TV está é : " + smartTv.canal);

        smartTv.ligar();//Aqui estamos chamando o metodo ligar, que fará a ação de alterar do false para true na variavel ligada.

        System.out.println("A TV está ligada? " + smartTv.ligada);
   
        smartTv.desligar();

        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();//Aqui estamos chamando o metodo aumentarVolume que adicionara mais 1 na variavel volume.
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("O volume da TV é: " + smartTv.volume);



    }
}
