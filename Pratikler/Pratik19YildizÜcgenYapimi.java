package Pratik;

public class Pratik19YildizÜcgenYapimi {
    public static void main(String[] args) {

        //Yildizlar ile ucgen yapmak
      /*
            int n=5;
      for (int i=0;i<n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        } */

        //Yildizlar ile elmas yapımı
        int yukseklik=5;
        int bosluk = yukseklik - 1;
        int yildiz = 1;

        // Elmasın üst kısmını çizdirme
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }

            System.out.println();
            bosluk--;
            yildiz += 2;
        }

        bosluk = 1;
        yildiz = yukseklik * 2 - 3;

        // Elmasın alt kısmını çizdirme
        for (int i = 0; i < yukseklik - 1; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }

            System.out.println();
            bosluk++;
            yildiz -= 2;
        }
    }
}
