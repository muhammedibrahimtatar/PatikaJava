package Pratik;
import java.util.Scanner;
public class Pratik6HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,islem,sonuc;

        System.out.print("Sayı 1'i giriniz: ");
        sayi1=input.nextInt();
        System.out.print("Sayı 2'i giriniz: ");
        sayi2=input.nextInt();
        System.out.print("Toplama için 1,Çıkarma için 2, Bölme için 3, Çarpma için 4'ü tuşlayınız.");
        islem=input.nextInt();

        switch (islem){
            case 1:
                System.out.print("Toplam sonucu: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.print("Cıkarma sonucu: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.print("Bölme sonucu: "+(sayi1/sayi2));
                break;
            case 4:
                System.out.print("Çarpma sonucu: "+(sayi1*sayi2));
                break;
            default:
                System.out.print("Hatalı giriş yapılmıştır.");
        }

    }
}
