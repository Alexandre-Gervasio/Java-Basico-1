
public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("\nTV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("\nNovo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.mudarCanal(20);
        System.out.println("Novo canal: " + smartTv.canal);
    }
}