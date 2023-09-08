public class LutadorMain {
    public static void main(String[] args) {
        
        System.out.println("Lutador 1: Ryu ");
        Lutador ryu = new Lutador();
        ryu.setNome("Ryu");
        ryu.setEnergia(100);
        ryu.setForça(10);
        System.out.println("Lutador 2: Bison");
        Lutador bison = new Lutador();
        bison.setNome("Bison");
        bison.setEnergia(100);
        bison.setForça(12);
        System.out.println("--------------------");

        for (int i = 0; i < 3 ; i++) {
            ryu.aplicarGolpe(bison);
        }

        System.out.println("Ryu aplicou 3 golpes em Bison.");
        System.out.println("Ryu: " + ryu.getEnergia());
        System.out.println("Bison: " + bison.getEnergia());
        System.out.println("--------------------");

        for (int i = 0; i < 8 ; i++) {
            bison.aplicarGolpe(ryu);
        }
        System.out.println("Bison aplicou 4 golpes em Ryu.");
        System.out.println("Ryu: " + ryu.getEnergia());
        System.out.println("Bison: " + bison.getEnergia());
    }
}
