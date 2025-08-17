package sprint13gun2practice;

//Aşağıda verilen metin üzerinde replaceAll metodunu kullanarak tüm rakamları '\*' karakteri ile değiştirin ve sonucu ekrana yazdırın.
// Yapılacak Adımlar:
// 1. replaceAll metodunu kullanarak metin değişkenindeki tüm rakamları '\*' ile değiştirin.
// Tüm rakamlar nasıl bulunur küçük bir google araması ile bulabilirsin.
// 2. Sonucu bir sonuc değişkenine atayın ve ekrana yazdırın.

public class Main06 {
    public static void main(String[] args) {
        String metin = "Java 123, çok 456, güzel 789";  // Rakamları '*' ile değiştirin
        String modifiedMetin = metin.replaceAll("\\d", "*");
        System.out.println(modifiedMetin);
    }
}
