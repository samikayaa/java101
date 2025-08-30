package sprint13gun3practice;

//Bir Ogrenci sınıfı tanımlayın ve bu sınıftan üç farklı nesne oluşturun.
// Her nesne, farklı bir isim ve yaş değeri içermeli.
// Yapılacak Adımlar:
// 1. Ogrenci adında bir sınıf oluşturun.
// 2. Bu sınıfta, String isim ve int yas adında iki örnek değişken tanımlayın.
// 3. Bu değişkenleri başlatan bir yapıcı metod tanımlayın.
// 4. Üç farklı Ogrenci nesnesi oluşturun
// (ogrenci1 -> Ali,20 ; ogrenci2 ->Ayşe,22 ; ogrenci3-> Mehmet,19) ve özelliklerini yazdırın.



public class Ogrenci {
    String isim;
    int yas;

    public Ogrenci(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }
}

public class Main02 {
    public static void main(String[] args){
        Ogrenci ogrenci1 = new Ogrenci("Ali",20);
        Ogrenci ogrenci2 = new Ogrenci("Ayşe",22);
        Ogrenci ogrenci3 = new Ogrenci("Mehmet",19);

        System.out.println(ogrenci1);
        System.out.println(ogrenci);
        System.out.println(ogrenci3);
    }
}
