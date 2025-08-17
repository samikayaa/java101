package sprint13gun2practice;

//Aşağıda verilen metin üzerinde split metodunu kullanarak boşluklara göre ayırın ve her bir kelimeyi ekrana yazdırın.
// Yapılacak Adımlar: 1. split metodunu kullanarak metin değişkenini boşluklara göre ayırın ve kelimler isminde bir değişkene atayınız.
// 2. Her bir kelimeyi ekrana yazdırın.

public class Main04 {
    public static void main(String[] args) {
        String metin = "Java çok güzel bir dil";
        String[] words = metin.split(" ");

        for(String i : words){
            System.out.println(i);
        }

    }
}
