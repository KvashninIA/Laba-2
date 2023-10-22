package Lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число ");
        int x = in.nextInt();

        int result = x / 4;

        System.out.println("Результат = " + result);
        if ((result > 10)|(result == 10)){
            System.out.println("Введенное число удовлетворяет условию задачи");
        } else {
            System.out.println("Условия не выполняется");
        }
    }
}