package Pratik;
import java.util.Scanner;
public class Pratik24GelismisHesapMakinesi {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int select;

        System.out.print("" +
                "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n"+
                "Lütfen hangi işlemi yapmak istediğinizi seçiniz:");
        select=input.nextInt();

        switch (select){
            case 1:
                Topla();
                break;
            case 2:
                Cikarma();
                break;
            case 3:
                Carp();
                break;
            case 4:
                Bol();
                break;
            case 5:
                UstAl();
                break;
            case 6:
                Factorial();
                break;
            case 7:
                ModAlma();
                break;
            case 8:
                AlanCevre();
                break;


        }

    }
    static void Topla(){
        Scanner input=new Scanner(System.in);
        int number,result=0,i=1;
        System.out.println("Çıkmak için 0'a basınız.");
        do{
            System.out.print(i+".Sayıyı giriniz:");
            number=input.nextInt();
            i++;
            result+=number;}
        while(number!=0);
            System.out.println("Sonuç: "+result);
    }
    static void Cikarma(){
        Scanner input=new Scanner(System.in);
        int number,i,count=0,result=0;
        System.out.println("Kaç adet sayı gireceksiniz:");
        count=input.nextInt();
        for (i=1;i<=count;i++){
            System.out.println(i+".sayı:");
            number=input.nextInt();
            if(i==1){
                result+=number;
                continue;
            }
            result-=number;
        }
        System.out.println("Sonuc: "+result);
    }

    static void Carp(){
        Scanner input = new Scanner(System.in);
        //Variables
        double count,number;
        double result=1;
        System.out.print("Kaç adet sayı gireceksiniz?:");
        count=input.nextInt();

        for(int i=1;i<=count;i++){
            System.out.print(i+". sayıyı giriniz:");
            number=input.nextInt();
            if (number==1){
                break;
            }else if(number==0){
                result=1;
                break;
            }
            result*=number;

        }
        System.out.println("Sonuc:"+result);

    }
    static void Bol(){
        Scanner input=new Scanner(System.in);
        int count,number,result=1;
        System.out.print("Kaç adet sayı gireceksiniz?:");
        count=input.nextInt();

        for(int i=1;i<=count;i++){
            System.out.println(i+". sayıyı giriniz:");
            number=input.nextInt();
            if(number==1){
                break;
            }
            result/=number;
        }
        System.out.println("Sonuc:"+result);
    }

    static void UstAl(){
        Scanner input=new Scanner(System.in);
        int base,power,result=1;
        System.out.print("Taban sayısını giriniz:");
        base=input.nextInt();
        System.out.print("Kuvvet sayısını giriniz:");
        power=input.nextInt();

        for (int i=1;i<=power;i++){
            result*=base;
        }
        System.out.println(base +" üzeri "+power+"="+result);
    }

    static void Factorial(){
        Scanner input=new Scanner(System.in);
        int number,result=1;
        System.out.print("Faktoriyel sayısını giriniz:");
        number=input.nextInt();
        for (int i=1;i<=number;i++){
            result*=i;
        }
        System.out.println("Faktoriyel işlem sonucu:"+result);
    }
    static void ModAlma(){
        Scanner input=new Scanner(System.in);
        int number1,number2,result=1;
        System.out.print("Sayı 1 giriniz:");
        number1=input.nextInt();
        System.out.print("Sayı 2 giriniz:");
        number2=input.nextInt();

        result=number1%number2;

        System.out.println(number1+" in "+number2+" ye bölümünden kalan: "+result);
    }

    static void AlanCevre(){
        Scanner input=new Scanner(System.in);
        int kenar1,kenar2,alan,cevre,result=1;
        System.out.print("Dikdörtgen kenarını giriniz:");
        kenar1=input.nextInt();
        System.out.print("Dikdörtgen kenarını giriniz:");
        kenar2=input.nextInt();

        alan=kenar1*kenar2;
        cevre=2*(kenar1+kenar2);
        System.out.println("Alan:"+alan+" Cevre:"+cevre);
    }

}
