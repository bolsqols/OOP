import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.print("write a=");
        Scanner a = new Scanner(System.in);
        double number1 = a.nextInt();
        double opv = number1 * 0.1; /* Обязательный пенсионный взнос */
        double vosms = number1 * 0.01;/* Индивидуальный подоходный налог */
        double ipn = (number1 - opv - 42500 - vosms) * 0.1;/* Взнос на ОСМС работником */
        System.out.print(number1 - opv - vosms - ipn);
    }

}