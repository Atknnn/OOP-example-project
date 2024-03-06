package ata.com;

public class Latte extends Esspreso {// Esspressodan miras aldık Latte sınıfına

    public Latte() {
        super("Latte");// super sayesinde Üst sınıftan kahvetipini
    }
    @Override // bu anatasyon sayesinde Esspressoda oluşturdugumuz, metodu Latte sınıfında çağırdık
    public void kahvehazirlaniyor() { // bu metot aynı zamanda espresso üst sınıfından kalıtımdır/miras
        System.out.println("espresso ve süt !"+ kahvetipi + " hazırlandı!!");
        // metodun içerisine nasıl yapıldıgı bilgisi eklendi
    }
}