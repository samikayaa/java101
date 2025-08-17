package sprint13gun2practice;

//Aşağıda verilen metin üzerinde toUpperCase metodunu kullanarak
// tüm harfleri büyük yapın ve toLowerCase metodunu kullanarak
// tüm harfleri küçük yapın. Sonuçları ekrana yazdırın.
// Yapılacak Adımlar:
// 1. toUpperCase metodunu kullanarak metin2 değişkeninin tüm harfleri büyük yapın ve buyuk isminde bir değişkene atayınız.
// 2. toLowerCase metodunu kullanarak metin değişkeninin tüm harfleri küçük yapın ve kucuk adında bir değişkene atayınız.
// 3. Sonuçları ekrana yazdırın.

import java.util.Locale;

public class Main08 {
    public static void main(String[] args) {
        String metin = "Java Programlama"; //Metnin harflerini küçük yap
        String metin2 = "java çok eğlenceli"; // Metnin harflerini büyük yap

        String lowerMetin = metin.toLowerCase();
        String upperMetin2 = metin2.toUpperCase();

        System.out.println(lowerMetin);
        System.out.println(upperMetin2);

        // toUpperCase ve toLowerCase metodlarını kullanarak metni değiştirin
        // Sonuçları ekrana yazdırın
    }
}

