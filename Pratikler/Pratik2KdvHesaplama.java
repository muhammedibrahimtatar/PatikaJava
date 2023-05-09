package Pratik;
import java.util.Scanner;

public class Pratik2KdvHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımladık
        double fiyat,kdv,kdvliFiyat;

        //Scanner tanımladık
        Scanner input=new Scanner(System.in);

        //Kullanıya bildirim yazdık.
        System.out.print("Ürün fiyatını giriniz:");

        //Kullanıcıdan veriyi aldık
         fiyat=input.nextDouble();

        //KDV Hesaplama
         kdv = (fiyat * 1.18)-fiyat;

        //KDV Dahil fiyat hesaplama
         kdvliFiyat = fiyat*1.18;

        System.out.println("KDV'siz fiyat:"+fiyat);
        System.out.println("KDV tutarı:"+kdv);
        System.out.println("KDVli tutar:"+kdvliFiyat);







    }
}
