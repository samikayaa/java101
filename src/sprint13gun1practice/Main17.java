package sprint13gun1practice;//while döngüsü kullanarak verilen sayının faktoriyelini hesaplamaya çalışın.

public class Main17 {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        while(number>0) {
            factorial *= number;
            number--;
        }

        System.out.println("Faktöriyel: " + factorial);
    }
}
