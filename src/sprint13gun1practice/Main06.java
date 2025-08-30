package sprint13gun1practice;// number değeri 0'dan büyükse ekrana Pozitif,
// değilse ekrana negatif yazdıran kodu ekleyiniz.

public class Main06 {
    public static void main(String[] args) {
        int number = -5;
        result(number);
    }
    public static void result(int number){
        if(number>0){
            System.out.println("Pozitif");
        } else {
            System.out.println("Negatif");
        }
    }
}


