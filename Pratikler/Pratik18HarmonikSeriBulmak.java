package Pratik;
import java.util.Scanner;

public class Pratik18HarmonikSeriBulmak {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Variables
        double number,total=0;

        //Input Values
        System.out.print("Lütfen sayıyı giriniz:");
        number=input.nextDouble();

        for (double i=1;i<=number;i++){
            total+=(1.0/i); //int int bölersek int deger döner. Bu sebeple double değerle bölüyoruz.
        }
        System.out.print(total);
    }
}
