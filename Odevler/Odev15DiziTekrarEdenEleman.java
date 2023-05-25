package Odevler;

public class Odev15DiziTekrarEdenEleman {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 2, 3, 1, 5, 1};

        int maxEleman = Integer.MIN_VALUE;
        for (int eleman : dizi) {
            if (eleman > maxEleman) {
                maxEleman = eleman;
            }
        }

        int[] elemanSayilari = new int[maxEleman + 1];

        for (int eleman : dizi) {
            elemanSayilari[eleman]++;
        }

        // Sonuçları yazdırma
        for (int i = 0; i < elemanSayilari.length; i++) {
            int sayi = elemanSayilari[i];
            if (sayi > 0) {
                System.out.println(i + " elemanı " + sayi + " kez tekrar edildi.");
            }
        }
    }
}
