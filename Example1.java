package Lr2;

import java.util.Scanner;
public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число ");
        int x = in.nextInt();

        int result = x % 3;
        System.out.println("Результат = " + result);
        if (result == 0) {
            System.out.println("Данное число делится на три без остатка");
        } else {
            System.out.println("Данное число не делится на три без остатка");
        }
    }
}