package Task3;

import java.util.Scanner;

public class Task3Massiv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какое задание запустить 1 (калькулятор) или 2(массив) ? ");
        int numbTask = scan.nextInt();
        switch (numbTask){
            case 1:
                Calculate();
                break;
            case 2:
                FindMass();
                break;
            default:
                System.out.println("Не, так не подойдет, напиши в следующий раз 1 или 2");
                break;
        }
    }

    public static void Calculate(){
        double v1,v2;
        String t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое дробное число(разделение целой и дробной части через запятую): ");
        v1 = scan.nextDouble();
        System.out.print("Введите второе дробное число(разделение целой и дробной части через запятую): ");
        v2 = scan.nextDouble();
        System.out.print("Ввидите тип операции ( + | - | / | * ) : ");
        scan.nextLine();
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

    public static void FindMass() {
        String maxLengWord = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи длинну массива: ");
        int lenghtMass = scan.nextInt();
        scan.nextLine();
        String[] textMass = new String[lenghtMass];
        for (int i = 0; i < lenghtMass; i++){
            System.out.println("Введи значение "+ i + " элемента массива :");
            textMass[i] = scan.nextLine();
            if (textMass[i].length() > maxLengWord.length()){
                maxLengWord = textMass[i];
            }
        }
        System.out.println("Максимально длинное слово - " + maxLengWord);
    }
}
