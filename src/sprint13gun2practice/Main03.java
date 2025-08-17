package sprint13gun2practice;

//Aşağıda verilen metin üzerinde trim metodunu kullanarak başındaki
// ve sonundaki boşlukları kaldırın ve sonucu ekrana yazdırın.

public class Main03 {
    public static void main(String[] args) {
        String metin = "   Merhaba Java!   ";
        String result = metin.trim();
        System.out.println(result);
    }
}
