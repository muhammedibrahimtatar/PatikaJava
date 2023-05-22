package Pratik;
import java.util.Scanner;
import java.util.Arrays;

public class Pratik26DizidekiElemanlardaMaxVeMin {
    public static void main(String[] args) {

        /* Dizideki büyük ve küçük sayıyı bulmak
        int list[]={-2,42,125,45,-44,-3,1244};
        int min=list[0];
        int max=list[0];

        for(int i:list){
            if(i<min){
                min=i;
            }
            if (i>max){
                max=i;
            }
        }
        System.out.println("Max değer:"+max);
        System.out.println("Min değer:"+min); */


        //Dizideki girilen sayıya yakın büyük ve küçük sayıyı bulmak

            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayı giriniz:");
            int sayi = scan.nextInt();

            int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
            Arrays.sort(numbers);
            int closeMax = 0, closeMin = 0;

            for (int a : numbers) {
                if (sayi < a) {
                    closeMax = a;
                    System.out.println("Girilen sayıdan büyük en yakın sayı :" + closeMax);
                    break;
                }
            }
            for (int i = numbers.length - 1; i > 0; i--) {
                if (sayi > numbers[i]) {
                    closeMin = numbers[i];
                    System.out.println("Girilen sayıdan küçük en yakın sayı :" + closeMin);
                    break;
                }
            }

        }
}


