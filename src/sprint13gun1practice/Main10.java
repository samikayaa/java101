package sprint13gun1practice;// strNumber değişkenini integer bir değere cevirip,
// strDecimal değerini de double bir değere çevirip toplayınız.
// Sonucu total adında uygun tipte bir değişkene atayınız.


public class Main10 {
    public static void main(String[] args) {
        String strNumber = "5100";
        String strDecimal = "44.40";

        int number = Integer.parseInt(strNumber);
        double decimal = Double.parseDouble(strDecimal);

        double result = number + decimal;
        System.out.println(result);
    }
}
