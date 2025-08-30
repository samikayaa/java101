package sprint13gun3practice;

//Aşağıda oluşturulmuş Kişi sınıfının özelliklerini doldurup ekrana yazdıracak şekilde tamamlayınız.
// Yapılacak Adımlar:
// 1. Kişi sınıfınının ad ve yaş özelliğine Ahmet ve 25 değerlerini atayın.
// 2. Bunları ekrana yazdırın.

public class Kisi {
    String ad;
    int yas;

    public Kisi(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }
}


class Main {
    public static void main(String[] args) {
        Kisi kisi = new Kisi("Ahmet",25);

        System.out.println(kisi.ad);
        System.out.println(kisi.yas);
    }
}
