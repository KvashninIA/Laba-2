package Lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число кратное 1000 ");
        int x = in.nextInt();

        int result = (x / 1000);

        System.out.println("Программа провела подсчет ");
        if (x >= 1000) {
            System.out.println("Количество тысяч во введенном числе " + result);
        } else {
            System.out.println("Введенное число не удовлетворяет условию задачи");
        }
    }
}
