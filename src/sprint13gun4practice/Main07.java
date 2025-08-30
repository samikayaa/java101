package sprint13gun4practice;

//Aşağıdaki Araba sınıfında bir public static metot tanımlayın ve
// main metodunda bu metodu çağırarak ekrana bilgi yazdırın.
// Yapılacak Adımlar:
// 1. Araba sınıfında static erişim belirleyici ile bir bilgiYazdir metodu tanımlayın.
// 2. Bu metot içinde "Araba Markası: BMW" yazdırın.
// 3. Main metodunda bu metodu çağırarak bilgiyi ekrana yazdırın.

public class Araba {
    public static String bilgiYazdir(String marka){
        return "Araba markası: " + marka;
    }
}


public class Main07 {
    public static void main(String[] args) {
        System.out.println(Araba.bilgiYazdir("BMW");
    }
}


