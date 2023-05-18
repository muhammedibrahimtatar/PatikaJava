package Odevler;
import java.util.Scanner;
public class Odev11RecursiveUstAlma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int base,power;
        System.out.print("Taban değerini giriniz:");
        base=input.nextInt();
        System.out.print("Kuvvet değerini giriniz:");
        power=input.nextInt();
        int a=RecAsal(base,power);
        System.out.println(a);
    }
    static int RecAsal(int base,int power){
        int result=0;

        if(power==0){
            return 1;
        }else {
            return base * RecAsal(base,power-1);
        }

    }
}
