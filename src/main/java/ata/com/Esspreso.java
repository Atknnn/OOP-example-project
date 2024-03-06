package ata.com;

abstract class Esspreso { // burası aynı zamanda soyutlama işlemdir Abstraction
String kahvetipi;// değişken oluşturduk !

public Esspreso(String kahvetipi){ // constructor oluşturduk
    this.kahvetipi = kahvetipi;
}
    public void kahvehazirlaniyor(){
    // bu metot POlİMORFİZİM için kullanacaımız metot Americano ve latte sınflarında farklı amaçlar için çağırılıyor !!
        System.out.println(kahvetipi + "kullanılarak hazırlandı!!");
    }

}
