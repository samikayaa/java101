package sprint13gun3practice;

//Aşağıda verilen Araba sınıfına argümansız bir constructor ekleyin.
// Bu constructor, marka değişkeninini "Peugeot", model değişkenini "3008" olarak başlatsın.
// Yapılacak Adımlar:
// 1. Araba sınıfına bir constructor tanımlayın.
// 2. Constructor'ın herhangi bir parametre almadığından emin olun (argümansız constructor).
// 3. Constructor içinde marka değişkeninini "Peugeot", model değişkenini "3008" olarak başlatın.

public class Araba {
    String marka;
    String model;

    public Araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
}


public static void main (String[] args) {
    Araba araba = new Araba("Pegout", "3008");
}