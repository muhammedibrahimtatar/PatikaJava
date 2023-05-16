package Odevler;
import java.math.BigDecimal;
import java.util.Scanner;
public class Odev6MinMaxDegerBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //variables
        int n,number,bigNumber,smallNumber;
        //input count
        System.out.print("Kaç tane sayı gireceksiniz:");
        n=input.nextInt();
        //input number
        System.out.println("1. sayıyı giriniz:");
        number=input.nextInt();
        bigNumber=number;
        smallNumber=number;
        for (int i=2;i<=(n);i++){
            System.out.println(i+". sayıyı giriniz:");
            number=input.nextInt();
            if(number>bigNumber){
                bigNumber=number;
            }else if(number<smallNumber){
                smallNumber=number;
            }

        }
        System.out.println("Büyük Sayı:"+bigNumber);
        System.out.println("Küçük Sayı:"+smallNumber);

    }
}
