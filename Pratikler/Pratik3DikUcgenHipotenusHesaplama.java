package Pratik;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Pratik3DikUcgenHipotenusHesaplama {
    public static void main(String[] args) {
        //Degiskenleri tanımladık
        double kenarA,kenarB,kenarC;

        //Kullanıcıdan verileri alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin a kenarını giriniz:");
        kenarA=input.nextDouble();
        System.out.print("Üçgenin b kenarını giriniz:");
        kenarB=input.nextDouble();
        kenarC=Math.sqrt((kenarA*kenarA)+(kenarB*kenarB));

        System.out.print("Hipotenüs:"+kenarC);

    }
}
