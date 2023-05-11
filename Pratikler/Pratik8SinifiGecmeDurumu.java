package Pratik;
import java.util.Scanner;
public class Pratik8SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Mat,Fiz,Turk,Kim,Muz,Ort;

        System.out.print("Matematik notunu giriniz:");
        Mat=input.nextInt();

        System.out.print("Fizik notunu giriniz:");
        Fiz=input.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        Turk=input.nextInt();

        System.out.print("Kimya notunu giriniz:");
        Kim=input.nextInt();

        System.out.print("Müzik notunu giriniz:");
        Muz=input.nextInt();

        Ort=(Mat+Fiz+Turk+Kim+Muz)/5;
        System.out.println("Ortalamanız:"+Ort);
    }
}
