package ata.com;

public class Tarifler {// KAPSÜLLEME YAPALIM

    public Tarifler(String americanoTarif, String latteTarif) { // BU SAYEDE YAZDIGIMIZ METOTUN içini mainde doldurduk !
    this.AmericanoTarif = americanoTarif;
    LatteTarif = latteTarif; // this yazmasakta çalışır karışıklıı isim çakışmasını onlemek için yazılır
    }

    public String getAmericanoTarif() {
        return AmericanoTarif;
    }

    public void setAmericanoTarif(String americanoTarif) {
        AmericanoTarif = americanoTarif;
    }

    public String getLatteTarif() {
        return LatteTarif;
    }

    public void setLatteTarif(String latteTarif) {
        LatteTarif = latteTarif;
    }

    private String AmericanoTarif;
    private String LatteTarif;


}
