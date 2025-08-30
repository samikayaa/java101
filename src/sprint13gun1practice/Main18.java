package sprint13gun1practice;//String olarak verilmiş word değişkenini karakter dizisine çeviriniz(toCharArray fonksiyonuna bakabilirsin)
// ve characters adında bir değişkene atayınız. Daha sonra bu characters dizisini bir for döngüsü ile geziniz.
// Eğer bu dizinin herhangi bir karakteri sesliler dizisinin içerisinde geçiyorsa
// (indexOf fonksiyonunu inceleyebilirsin) ekrana o karakteri yazdırınız.

public class Main18 {
    public static void main(String[] args) {
        String word = "I will be a Javatar";
        String sesliler = "AaEeIiOoUu";

        // String'i karakter dizisine çevir
        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            // Eğer karakter sesliler dizisinde varsa ekrana yaz
            if (sesliler.indexOf(characters[i]) != -1) {
                System.out.println(characters[i]);
            }
        }

    }
}
