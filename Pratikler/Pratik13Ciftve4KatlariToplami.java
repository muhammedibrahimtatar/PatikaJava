package Pratik;
import java.util.Scanner;
public class Pratik13Ciftve4KatlariToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,total=0;

        do{
            System.out.print("Sayi giriniz:");
            n=input.nextInt();
            if (n%2==0 || n%4==0){
                total+=n;
            }
        }
        while(n%2==0);
        System.out.print("Çift ve 4 katları sayının toplamı:"+total);
}
}
