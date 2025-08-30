package sprint13gun3practice;

//Bir Bilgisayar sınıfı tanımlayın ve bu sınıftan üç farklı nesne oluşturup, farklı referanslara atayın.
// Yapılacak Adımlar:
// 1. İçi şimdilik boş olan Bilgisayar adında bir sınıf tanımlayın.
// 2. Bu sınıftan bilgisayar1, bilgisayar2 ve bilgisayar3 adında 3 nesne olurup referanslara atayın.


public class Bilgisayar {
    // Şimdilik içi boş
}

public class Main01 {

    public static void main(String[] args)

    Bilgisayar bilgisayar1 = new Bilgisayar();
    Bilgisayar bilgisayar2 = new Bilgisayar();
    Bilgisayar bilgisayar3 = new Bilgisayar();

    // Konsola yazdıralım (referans adreslerini görebilmek için)
        System.out.println('Bilgisayar1 referansı: ' + bilgisayar1);
        System.out.println('Bilgisayar2 referansı: ' + bilgisayar2);
        System.out.println('Bilgisayar3 referansı: ' + bilgisayar3);

}
