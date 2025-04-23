
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("\nAumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("\nDiminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("\nMudando o canal para: " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("\nAumentando o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("\nDiminuindo o canal para: " + canal);
    }
}