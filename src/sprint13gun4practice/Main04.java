package sprint13gun4practice;

//Aşağıdaki HesapMakinesi sınıfına bir static metot ekleyin.
// Bu metot, iki sayıyı toplamalıdır.
// Yapılacak Adımlar:
// 1. HesapMakinesi sınıfına static bir topla metodu ekleyin.
// 2. Main sınıfında bu metodu çağırarak sonucu ekrana yazdırın.

public class HesapMakinesi {
    // Static metot ekleyin
    public static int topla(int a, int b){
        return a+b;
    }
}

public class Main04 {
    public static void main(String[] args) {
        int sonuc = HesapMakinesi.topla(5, 7); // Static metot çağrılacak
        System.out.println("Toplam: " + sonuc);
    }
}
