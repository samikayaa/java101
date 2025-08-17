package sprint13gun2practice;

//Aşağıdaki verilen cumle değişkenini, replaceAll ve split metodlarını kullanarak,
// tüm boşluklarını kaldırın ve ardından harflere ayırarak ekrana yazdırın.
// Yapılacak Adımlar:
// 1. cumle değişkenindeki tüm boşlukları replaceAll metoduyla kaldırın.
// 2. Boşlukları kaldırılmış cümleyi, split metodu ile harflere ayırın ve bunu harfler adlı değişkene atayın.
// 3. Her harfi ekrana yazdırın.

public class Main09 {
    public static void main(String[] args) {
        String cumle = "Java programlama dilini öğrenmek çok eğlencelidir";
        System.out.println(cumle);
        String complicatedCumle = cumle.replaceAll(" ", "");
        String[] harfler = complicatedCumle.split("");

        for(String i : harfler){
            System.out.println(i);
        }
    }
}

