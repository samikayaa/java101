package sprint13gun2practice;

//Aşağıda verilen metin üzerinde contains metodunu kullanarak belirli bir kelimenin metin değişkeninde olup olmadığını kontrol edin
// ve sonucu ekrana yazdırın.
// Yapılacak Adımlar:
// 1. contains metodunu kullanarak 'program' kelimesinin metin değişkeninde olup olmadığını kontrol edin.
// 2. Sonucu varMi değişkenine atayın ve ekrana yazdırın.

public class Main07 {
    public static void main(String[] args) {
        String metin = "Java programlama dili";  // 'program' kelimesi var mı kontrol edin
        boolean varMi = metin.contains("program");
        System.out.println(varMi);
    }
}

