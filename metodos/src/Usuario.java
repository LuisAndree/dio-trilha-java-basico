public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.estado);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.canal);

        smartTv.ligar();
        System.out.println(smartTv.estado);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println(smartTv.canal);

        smartTv.mudarCanal(8);
        System.out.println(smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        smartTv.desligar();
        System.out.println(smartTv.estado);
    }
}
