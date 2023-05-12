package Odevler;
import java.util.Scanner;
public class Odev5ArtikYilSorgulama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;

        System.out.print("Yılı giriniz:");
        yil=input.nextInt();

        if(yil%100==0){
            if(yil%400==0){
                System.out.println(yil+" Artık yıldır");
            }
            else {
                System.out.println(yil+" Artık yıl değildir");
            }
        } else if (yil%4==0) {
            System.out.println(yil+" Artık yıldır");
        }else{
            System.out.println(yil+" Artık yıl değildir.");
        }

    }
}
