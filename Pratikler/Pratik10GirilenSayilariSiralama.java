package Pratik;

import java.util.Scanner;
public class Pratik10GirilenSayilariSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer sayi1,sayi2,sayi3;

        System.out.print("Sayi 1'i giriniz:");
        sayi1=input.nextInt();

        System.out.print("Sayi 2'i giriniz:");
        sayi2=input.nextInt();

        System.out.print("Sayi 3'i giriniz:");
        sayi3=input.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3){
            if (sayi2>sayi3){
                System.out.println(sayi1+">"+sayi2+">"+sayi3);
            }else{
                System.out.println(sayi1+">"+sayi3+">"+sayi2);
            }
        }else if(sayi2>sayi1 && sayi2>sayi3){
            if(sayi1>sayi3){
                System.out.println(sayi2+">"+sayi1+">"+sayi3);
            }else{
                System.out.println(sayi2+">"+sayi3+">"+sayi1);
            }
        }else if(sayi3>sayi1 && sayi3>sayi2){
            if(sayi1>sayi2){
                System.out.println(sayi3+">"+sayi1+">"+sayi2);
            }else{
                System.out.println(sayi3+">"+sayi2+">"+sayi1);
            }
        }

    }



}
