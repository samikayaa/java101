package sprint13gun4practice;

//Aşağıdaki Ogrenci sınıfında bir public değişken tanımlayın ve
// main metodu içinde bu değişkene erişerek bir değer atayın ve
// ekrana yazdırın. Yapılacak Adımlar:
// 1. Ogrenci sınıfında isim adında bir public String değişken tanımlayın.
// 2. Main metodunda bu değişkene erişerek "Ali" değerini atayın.
// 3. Atanan değeri ekrana yazdırın.

public class Ogrenci {
    public String isim; //public değişken tanımlandı
}


public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci(); // Ogrenci nesnesi oluşturuyorum.
        ogrenci.isim = "Ali";
        System.out.println(ogrenci.isim);
    }
}
