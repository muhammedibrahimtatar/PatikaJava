package Odevler;
import java.util.Scanner;
public class Odev2ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,total=0,armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? :");
        armutKilo = input.nextDouble();
        armut=armut*armutKilo;

        System.out.print("Elma Kaç Kilo? :");
        elmaKilo=input.nextDouble();
        elma=elma*elmaKilo;

        System.out.print("Domates Kaç Kilo? :");
        domatesKilo=input.nextDouble();
        domates=domates*domatesKilo;

        System.out.print("Muz Kaç Kilo? :");
        muzKilo=input.nextDouble();
        muz=muz*muzKilo;

        System.out.print("Patlıcan Kaç Kilo? :");
        patlicanKilo=input.nextDouble();
        patlican=patlican*patlicanKilo;

        total=armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar:"+total+" TL");
    }
}
