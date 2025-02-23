public class SmartTv {

    //As variaveis abaixo podem ser utilizadas em qualquer parte da classe;
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    //Metodos são ações, nesta classe estamos criando vários metodos;

    public void mudarCanal(int novoCanal){
        canal=novoCanal; //A variavel novoCanal só pode ser acessada no metodo mudarCanal, não sendo possível acessa-la em outro escopo do código;
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
