package Pratik;
import java.util.Random;
import java.util.Scanner;

public class Pratik30SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int right=1,userNumber;
        //Random sayi üretmek yol 1
        //int number=(int)(Math.random()*100); //Türü int'e çeviriyoruz

        //Random sayi üretmek yol 2
        Random rnd=new Random();
        int number=rnd.nextInt(100); //100'e kadar int sayı üret
        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz");
        System.out.println("-------------------------------");

        for (int i=6;i>=right;i--){
            if (i>right){
                System.out.print("0 ile 100 arasında bir sayı giriniz:");
                userNumber=input.nextInt();
                if (userNumber==number){
                    System.out.println("Tebrikler sayıyı doğru tahmin ettiniz");
                    break;
                }else if(userNumber<number){
                    System.out.println("Sayı daha büyük");
                }else{
                    System.out.println("Sayı daha küçük");
                }
            }else{
                System.out.println("Malesef hakkınız bitti. Doğru Sayı:"+number);
            }

        }


    }
}
