public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    //Metodos são ações, nesta classe estamos criando vários metodos

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
