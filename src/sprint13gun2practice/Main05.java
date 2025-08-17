package sprint13gun2practice;

// Aşağıda verilen metin üzerinde replace metodunu kullanarak belirli bir karakteri başka bir karakterle değiştirin
// ve sonucu ekrana yazdırın.
// Yapılacak Adımlar:
// 1. replace metodunu kullanarak metin değişkeninde 'ç' harfini 'C' harfi ile değiştirin.
// 2. Sonucu bir sonuc değişkenine atayın ve ekrana yazdırın.

public class Main05 {
    public static void main(String[] args) {
        String metin = "Java çok güzel";  // 'ç' harfini 'C' harfi ile değiştirin
        String modifiedMetin = metin.replace("ç", "C");
        System.out.println(modifiedMetin);
    }
}