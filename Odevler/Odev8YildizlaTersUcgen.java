package Odevler;
import java.util.Scanner;
public class Odev8YildizlaTersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int length;
        System.out.print("Kaç basamakla başlayan bir üçgen olacaktır.");
        length=input.nextInt();

        int space=1;
        int star=length*2-3;

        for (int i=0;i<length-1;i++){{
            for (int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }

            System.out.println();
            space++;
            star -=2;

        }
    }
}}
