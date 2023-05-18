package Odevler;
import java.util.Scanner;
public class Odev10Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Variables
        int numberCount, num1=0,num2=1,result=0;

        //Input the count
        System.out.print("Eleman sayısını giriniz:");
        numberCount=input.nextInt();

        //Accounting
        for (int i=1;i<numberCount+1;i++){
            result=num1+num2;
            num1=num2;
            num2=result;
            System.out.println(result);
        }

    }
}
