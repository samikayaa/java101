package sprint13gun3practice;

//Aşağıdaki Öğrenci sınıfını kullanarak bir nesne oluşturun ve özelliklerini ekrana yazdırın.
// Yapılacak Adımlar:
// 1. Ogrenci sınıfının isim ve ortalama özelliklerine "Elif" ve 89.5 değerlerini atayın.
// 2. Bunları ekrana yazdırın.


class Ogrenci {
    String isim;
    double ortalama;

    public Ogrenci(String isim, double ortalama){
        this.isim = isim;
        this.ortalama = ortalama;
    }
}


public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Elif", 89.5);

        System.out.println(ogrenci.isim);
        System.out.println(ogrenci.ortalama);
    }
}

