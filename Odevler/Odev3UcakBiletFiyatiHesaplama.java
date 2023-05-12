package Odevler;
import java.util.Scanner;
public class Odev3UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, ucus;
        double normalTutar, yasIndirimi, indirimliTutar, gidisDonusIndirimi, total;

        System.out.print("Uçulacak mesafeyi KM olarak giriniz:");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        yas = input.nextInt();
        System.out.print("Yolculuk tipinizi giriniz(1-Tek Yön, 2-Gidiş Geliş):");
        ucus = input.nextInt();

        normalTutar = mesafe * 0.10;

        switch (ucus) {
            case 1: {
                if (yas < 12) {
                    total = normalTutar * 0.5;
                    System.out.println("Bilet Fiyatı:" + total);
                } else if (yas >= 12 && yas <= 24) {
                    total = normalTutar * 0.9;
                    System.out.println("Bilet Fiyatı:" + total);
                } else if (yas > 65) {
                    total = normalTutar * 0.7;
                    System.out.println("Bilet Fiyatı:" + total);
                }else{
                    System.out.println("Bilet Fiyatı:" + normalTutar);
                }
                break;
            }
            case 2: {
                if (yas < 12) {
                    total = ((normalTutar * 0.5) * 0.8)*2;
                    System.out.println("Bilet Fiyatı:" + total);
                } else if (yas >= 12 && yas <= 24) {
                    total = ((normalTutar * 0.9) * 0.8)*2;
                    System.out.println("Bilet Fiyatı:" + total);
                } else if (yas > 65) {
                    total = ((normalTutar * 0.7) * 0.8)*2;
                    System.out.println("Bilet Fiyatı:" + total);
                }else{
                    total=normalTutar*2;
                    System.out.println("Bilet Fiyatı:"+normalTutar);
                }
                break;
            }
            default: {
                System.out.println("Hatalı giriş yaptınız.");
                break;
            }

        }
    }}