package Pratik;
/*
    Armstrong sayı nedir? N sayısının, basamak sayısının üstlere atanıp bu sayıların toplamının sayının kendisi yapıyorsa bu sayı
    armstrong bir sayıdır.

    Örn 407 = 4^3 + 0^3 + 7^3 = 64+0+343 = 407
* */
import java.util.Scanner;
public class Pratik17ArmstrongSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt(),basNumber = 0,tempNumber = number,basValue, result = 0,basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
    }
}
