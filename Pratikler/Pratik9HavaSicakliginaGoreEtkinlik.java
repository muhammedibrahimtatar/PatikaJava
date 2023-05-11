package Pratik;
import java.util.Scanner;
public class Pratik9HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);

        System.out.print("Hava sıcaklık değerini giriniz:");
        sicaklik=input.nextInt();

        if (sicaklik<=5){
            System.out.println("Bugün kayak yapabilirsin.");
        }else if(sicaklik>5 && sicaklik<=15){
            System.out.println("Bugün sinemaya gidebilirsin");
        }else if(sicaklik>15 && sicaklik<=25){
            System.out.println("Bugün piknik yapabilirsin");
        }else if(sicaklik>25){
            System.out.println("Bugün Yüzmeye gidebilirsin");
        }
    }
}
