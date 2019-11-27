package Task1_2;

import java.util.Scanner;

public class Task1_2Calc {

    /**
     * Калькулятор, оперирующий дробными числами
     * */

    public static void main(String[] args) {
        double v1,v2;
        String t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое дробное число(разделение целой и дробной части через запятую): ");
        v1 = scan.nextDouble();
        System.out.print("Введите второе дробное число(разделение целой и дробной части через запятую): ");
        v2 = scan.nextDouble();
        System.out.print("Ввидите тип операции ( + | - | / | * ) : ");
        t = scan.nextLine();// не знаю как убрать эту строку и не словить пропуска ввода из-за ввода строки в прошлом
        t = scan.nextLine();

        //выполнение операции
        if ("+".equals(t)) {
            System.out.printf("Ответ = %.4f", v1 + v2);
        } else if ("-".equals(t)) {
            System.out.printf("Ответ = %.4f", v1 - v2);
        } else if ("/".equals(t)) {
            System.out.printf("Ответ = %.4f", v1 / v2);
        } else if ("*".equals(t)) {
            System.out.printf("Ответ = %.4f", v1 * v2);
        } else {
            System.out.println("Не верный тип операции или он не введен совсем.");
            /*выводится тогда,
            когда пользователь не ввел тип операции */
        }
    }
}
