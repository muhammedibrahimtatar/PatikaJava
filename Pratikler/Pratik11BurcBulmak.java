package Pratik;
import java.util.Scanner;

public class Pratik11BurcBulmak {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dGun,dAy;

        System.out.print("Doğduğunuz günü giriniz:");
        dGun=input.nextInt();
        System.out.print("Doğduğunuz ayı giriniz:");
        dAy=input.nextInt();
        if (dGun>=1 && dGun<=31) {
            if (dAy == 1) {
                if (dGun <= 21) {
                    System.out.println("Burcunuz Oğlak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            } else if (dAy == 2) {
                if (dGun <= 19) {
                    System.out.println("Burcunuz Kova ");
                } else {
                    System.out.println("Burcunuz Balık");
                }
            } else if (dAy == 3) {
                if (dGun <= 20) {
                    System.out.println("Burcunuz Balık ");
                } else {
                    System.out.println("Burcunuz Koç");
                }
            } else if (dAy == 4) {
                if (dGun <= 20) {
                    System.out.println("Burcunuz Koç ");
                } else {
                    System.out.println("Burcunuz Boğa");
                }
            } else if (dAy == 5) {
                if (dGun <= 21) {
                    System.out.println("Burcunuz Boğa ");
                } else {
                    System.out.println("Burcunuz İkizler");
                }
            } else if (dAy == 6) {
                if (dGun <= 22) {
                    System.out.println("Burcunuz İkizler ");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
            } else if (dAy == 7) {
                if (dGun <= 23) {
                    System.out.println("Burcunuz Yengeç ");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
            } else if (dAy == 8) {
                if (dGun <= 22) {
                    System.out.println("Burcunuz Aslan ");
                } else {
                    System.out.println("Burcunuz Başak");
                }
            } else if (dAy == 9) {
                if (dGun <= 22) {
                    System.out.println("Burcunuz Başak ");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            } else if (dAy == 10) {
                if (dGun <= 22) {
                    System.out.println("Burcunuz Terazi ");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
            } else if (dAy == 11) {
                if (dGun <= 21) {
                    System.out.println("Burcunuz Akrep ");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            } else if (dAy == 12) {
                if (dGun <= 21) {
                    System.out.println("Burcunuz Yay ");
                } else {
                    System.out.println("Burcunuz Oğlak");
                }
            }

        }
    }
}
