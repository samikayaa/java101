package sprint13gun3practice;

//Bir Kitap sınıfı verilmiştir.
// Bu sınıfın özelliklerini tamamlayarak bir nesne oluşturun ve ekrana yazdırın.
// Yapılacak Adımlar: 1. Kitap sınıfının ad ve sayfaSayisi özelliklerine "Java 101" ve 300 değerlerini atayın.
// 2. Bunları ekrana yazdırın.

public class Kitap {
    String ad;
    int sayfaSayisi;

    public Kitap(String ad, int sayfaSayisi){
        this.ad = ad;
        this.sayfaSayisi = sayfaSayisi;
    }
}

class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Java 101", "300");

        System.out.println(kitap.ad);
        System.out.println(kitap.sayfaSayisi);
    }
}

