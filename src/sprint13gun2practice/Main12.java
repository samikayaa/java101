package sprint13gun2practice;

// Verilen dizideki çift sayıların toplamını hesaplayarak ekrana yazdırınız.
// Yapılacak Adımlar:
// 1. Verilen dizi üzerinde döngü ile ilerleyin.
// 2. Sadece çift olan sayıları toplayın ve toplamı ekrana yazdırın.

public class Main12 {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // Verilen dizi

        int sum = 0;

        for( int i : sayilar) {
            if (i % 2 == 0 ) {
                sum = sum + i;
            }
        }
        // Çift sayıların toplamını hesaplayın ve yazdırın.
        System.out.println(sum);
    }
}

