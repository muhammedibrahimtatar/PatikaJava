package Pratik;
import java.util.Scanner;
public class Pratik14GirilenSayiyaKadar4ve5kuvvetleri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz:");
        int n= input.nextInt();

        for(int i=1;i<=n;i*=4){
            System.out.println("4.kuvveti:"+i);
        }
        for(int i=1;i<=n;i*=5){
            System.out.println("5.kuvveti:"+i);
        }

    }
}
