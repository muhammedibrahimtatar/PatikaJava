package Pratik;
import java.util.Scanner;

public class Pratik21EbobEkokHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2,ebob=0,ekok=0,kSayi;

        System.out.print("Lütfen sayı 1'i giriniz:");
        sayi1=input.nextInt();
        System.out.print("Lütfen sayı 2'i giriniz:");
        sayi2=input.nextInt();

        if (sayi1<sayi2){
            kSayi=sayi1;
        }else{
            kSayi=sayi2;
        }
        //EBOB bulmak 1. yol
        for (int i=1;i<=kSayi;i++){
            if(sayi1%i==0 && sayi2%i==0){
                System.out.println(i);
                ebob=i;
            }
        }
        System.out.println("EBOB:"+ebob);

        //EBOB bulmak 2. yol(Döngüyü ters taraftan çalıştırdık)
        for (int k=kSayi;k>=1;k--){
            if(sayi1%k==0 && sayi2%k==0){
                ebob=k;
                System.out.println("EBOB-2:"+ebob);
                break;
            }
        }

        //EKOK bulmak
        for(int i=1;i<=(sayi1*sayi2);i++){
            if (i%sayi1==0 && i%sayi2==0){
                System.out.println("EKOK:"+i);
                break;
            }
        }
    }
}
