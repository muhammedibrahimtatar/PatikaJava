package Pratik;
import java.util.Scanner;

public class Pratik4TaksimetreHesaplama {
    public static void main(String[] args) {
        //Degiskenleri tanımlıyoruz
        double mesafe,kmUcret = 2.20,taxAcilis=10,toplam;
        Scanner input=new Scanner(System.in);
        //Kullanıcıdan mesafeyi alıyoruz
        System.out.print("Mesafeyi km olarak giriniz:");
        mesafe=input.nextInt();
        //Hesaplamayı yapıyoruz
        toplam=taxAcilis+(mesafe*kmUcret);
        toplam = (toplam<20) ? 20:toplam;

        System.out.println("Toplam ücret:"+toplam);



    }
}
