package ata.com;

public class Americano extends Esspreso {// Espressodan Americanoya miras aldık
    public Americano() {
        super("Americano");//Süper sayesinde üst sınıfında this olarak yazdıgımz değişkeni çağırdık
    }
    @Override//bu anatasyonu Espresso da yazdgımız metodu aynen çağırabilmek için yazdık

    public void kahvehazirlaniyor(){// bu metot bide Espressodan kalıtım olarak alındı
        System.out.println("espresso ve su !"+kahvetipi+" hazırlandı!!");
    }




    }
