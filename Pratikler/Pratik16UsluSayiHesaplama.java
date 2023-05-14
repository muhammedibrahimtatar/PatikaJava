package Pratik;
import java.util.Scanner;
public class Pratik16UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int b,n,sonuc=1;

        System.out.print("Lütfen taban sayıyı giriniz:");
        b=input.nextInt();
        System.out.print("Lütfen üst sayıyı giriniz:");
        n=input.nextInt();

        for(int i=1;i<=n;i++){
            sonuc*=b;
        }
        System.out.println("Sonuç:"+sonuc);
    }
}
