package Lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число ");
        int x = in.nextInt();

        int result = x % 5;
        int result2 = x % 7;

        System.out.println("Результат= " + result);
        System.out.println("Результат 2 = " + result2);
        if ((result == 2)|(result2 == 1)){
            System.out.println("Введенное число удовлетворяет одному из критериев задачи");
        } else {
            System.out.println("Критерии не выполняются");
        }
    }
}

