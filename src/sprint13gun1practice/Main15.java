package sprint13gun1practice;// text isminde String tipinde bir değişken tanımlayınız ve Java değerini atayınız.
// Daha sonra bir for döngüsü ile tüm karakterlerini ekrana bastırınız.

public class Main15 {
    public static void main(String[] args) {

        String text = "Java";

        for(int i = 0; i < text.length(); i++ ) {
            System.out.println(text.charAt(i));
        }

    }
}

