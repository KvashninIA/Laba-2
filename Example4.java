package Lr2;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число ");
        int x = in.nextInt();

        int result = x;

        System.out.println("Результат = " + result);
        if ((result >= 5) & (result <= 10)){
            System.out.println("Введенное число удовлетворяет условию задачи");
        } else {
            System.out.println("Введенное число не удовлетворяет условию задачи");
        }
    }
}
