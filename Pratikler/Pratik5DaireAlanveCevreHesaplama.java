package Pratik;
import java.util.Scanner;

public class Pratik5DaireAlanveCevreHesaplama {
    public static void main(String[] args) {
        //Degiskenler tanımlıyoruz
        double pi=3.14,r,cevre,alan;
        Scanner input=new Scanner(System.in);
        //Kullanıcıdan veri alıyoruz
        System.out.print("Dairenin yarıçapını giriniz:");
        r=input.nextInt();

        cevre=2*pi*r;
        alan=pi*r*r;

        System.out.println("Dairenin cevresi:"+cevre);
        System.out.println("Dairenin alanı:"+alan);


    }
}
