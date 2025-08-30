package sprint13gun3practice;

//Aşağıdaki Telefon sınıfını tamamlayarak bir nesne oluşturun ve özelliklerini ekrana yazdırın.
// Yapılacak Adımlar:
// 1. Telefon sınıfının marka ve fiyat özelliklerine "Samsung" ve 15000.5 değerlerini atayın.
// 2. Bunları ekrana yazdırın.

public class Telefon {
    String marka;
    double fiyat;

    public Telefon(String marka, double fiyat){
        this.marka = marka;
        this.fiyat = fiyat;
    }
}


class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon("Samsung",15000.5);

        System.out.println(telefon.marka);
        System.out.println(telefon.fiyat);
    }
}

