package sprint13gun2practice;

// topla isminde bir metod tanımlayınız.
// İki int parametre alıp, bu parametrelerin toplamını döndüren bir metod olmasını bekliyoruz.
// Yapılacak Adımlar:
// 1. topla metodunu tamamlayın. Alacağı parametrelere a ve b isimlerini veriniz.
// 2. Metodu sonuc değişkenine atayıp a değişkenine 5, b değişkenine 3 parametresini verip çağırın.

public class Main11 {
    public static void main(String[] args) {
        int sonuc = topla(3,5);
        System.out.println("Toplam: " + sonuc);
    }

    public static int topla(int a, int b){
        return a + b;
    }
}
