package Pratik;
import java.util.Scanner;

public class Pratik1NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        // Sınıfı ekledik
        Scanner inp = new Scanner(System.in);

        //Degiskenleri oluşturma
        int matematik,fizik,kimya,turkce,tarih;

        System.out.print("Matematik notunuzu giriniz:");
        matematik = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        System.out.print("Turkce notunuzu giriniz:");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        int toplam = matematik+fizik+kimya+turkce+tarih;
        double sonuc = toplam /5;
        String sonuc2= (sonuc>=60) ? "Gecti":"Kaldi";
        System.out.println("Ortalamanız : " + sonuc);
        System.out.println("Sonuc: " + sonuc2);



    }

}
