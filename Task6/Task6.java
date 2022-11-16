/*Написать метод, который определяет, является ли год високосным, и возвращает boolean 
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, 
при этом каждый 400-й – високосный. */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Укажите год: ");
        int year = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        leapYearOrNot(year);
    }

    static void leapYearOrNot(int y) {
        System.out.println(y);
        if (!(y % 4 == 0) || ((y % 100 == 0) && !(y % 400 == 0))) {
            System.out.println(y + " год не является високосным");
        } else {
            System.out.printf(y + " год - високосный");
        }
    }
}
