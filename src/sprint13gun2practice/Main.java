package sprint13gun2practice;

//Aşağıdaki verilen metodu, verilen parametrelerle doğru bir şekilde tanımlayın.
// concatenate metodunun, bir String ve bir int parametre alıp,
// bu parametreleri birleştirip bir String döndüren bir metod olmasını bekliyoruz.
//
// Yapılacak Adımlar:
// 1. concatenate metodunu tamamlayın.
// 2. concatenate metodunu result değişkenine atayıp "Java" ve 7 parametrelerini verip çağırın.

public class Main {

    public static String concatenate(String text, int number) {
        // Parametreleri birleştirip döndüren kodu yazın
        String numToStr = Integer.toString(number);
        return  text + numToStr;
    }


    public static void main(String[] args) {
        String result = concatenate("Java", 7); // Metodu result değişkenine atayıp "Java" ve 7 parametrelerini verip çağırın
        System.out.println(result);
    }
}
