// Aşağıdaki kodda ekrana 5 kere 'Döngü çalışıyor' yazdırılmak istenmektedir.
// Bu işlem için kodda flag değişkenini tipini dogru belirleyerek tanımlayınız.
// while döngüsü içerisine de 1 adet şartlı ifade ekleyiniz.

public class Main14 {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Döngü çalışıyor");
            count++;

            if (count >= 5) {
                flag = false;
            }
        }
    }
}
