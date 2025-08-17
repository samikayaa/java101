package sprint13gun2practice;

//Kullanıcıdan bir cümle alın ve bu cümledeki en uzun kelimeyi bulun.
// (Scanner kütüphanesinin kullanımına bakmalısın)
//
// Yapılacak Adımlar:
// 1. Kullanıcıdan bir cümle alın.
// 2. Bu cümleyi boşluklara göre ayırarak kelimeler adli bir diziye çevirin.
// 3. Her kelimeyi kontrol ederek enUzunKelime'yi bulun.
// 4. Sonuç olarak enUzunKelime'yi ekrana yazdırın.

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");
        String enUzunKelime = "";

        for(String i : kelimeler){
            if(i.length() > enUzunKelime.length()) {
                enUzunKelime = i;
            }
        };

        System.out.println("En uzun kelime:" + enUzunKelime);
    }
}


