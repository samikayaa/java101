package sprint13gun2practice;

//Aşağıdaki verilen metodu, contains ve replace metodlarını kullanarak, verilen bir cümlede "Java" kelimesinin olup olmadığını kontrol edin.
// Eğer "Java" kelimesi varsa, tüm "Java" kelimelerini "Python" ile değiştirin.
// Yapılacak Adımlar:
// 1. cumle değişkeninde "Java" kelimesinin olup olmadığını contains metoduyla kontrol edin.
// 2. Eğer "Java" kelimesi varsa, tüm "Java" kelimelerini "Python" ile değiştirin.
// 3. cumle değişkenini ekrana yazdırın.

public class Main10 {

    public static void main(String[] args) {
        String cumle = "Java programlama çok yaygın bir dil. Java dilini öğrenmek kolaydır.";
        boolean javaVarMi = cumle.contains("Java");
        if (javaVarMi == true) {
            String cumlePython = cumle.replaceAll("Java", "Python");
            System.out.println(cumlePython);
        }

    }
}
