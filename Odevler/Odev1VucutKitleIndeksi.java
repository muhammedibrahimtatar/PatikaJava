package Odevler;
import java.util.Scanner;
public class Odev1VucutKitleIndeksi {
    public static void main(String[] args) {
        float kilo,boy,indeks;
        Scanner input=new Scanner(System.in);

        System.out.print("Kilonuzu giriniz:");
        kilo = input.nextFloat();

        System.out.print("Boyunuzu giriniz(Örn:1.75):");
        boy = input.nextFloat();

        indeks = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+indeks);
    }
}
