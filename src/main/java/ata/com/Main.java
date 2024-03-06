package ata.com;

public class Main {
    public static void main(String[] args) {
        Esspreso Americano = new Americano();// burda olşuturdugmuz americano nesnesidir
        Esspreso Latte = new Latte();
        //KAPSÜLLEME
        Tarifler tarifler = new Tarifler("su ve espresso","süt ve espresso");

        //Polimorfizim aynı 2 metot farklı amaçlarda ve işlevlerde kullanıldı !!
        Americano.kahvehazirlaniyor();
        Latte.kahvehazirlaniyor();

        System.out.println("Americanonun tarifi = " + tarifler.getAmericanoTarif());// burda get setile yaptıgmız tarfileri çagırdık
        System.out.println("Lattenin tarifi = " + tarifler.getLatteTarif());

    }
}