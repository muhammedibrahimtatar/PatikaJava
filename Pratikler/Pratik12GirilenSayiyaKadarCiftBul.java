package Pratik;
import  java.util.Scanner;
public class Pratik12GirilenSayiyaKadarCiftBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Sayıyı giriniz:");
        sayi=input.nextInt();

        for (int i=1;i<=sayi;i++){
            if(i%2==1){
                continue;
            }
            System.out.print(i+",");
        }
    }
}
