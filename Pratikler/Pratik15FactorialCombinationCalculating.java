package Pratik;
import java.util.Scanner;
public class Pratik15FactorialCombinationCalculating {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*
        // Factorial Calculating   n!=1*2*3*4*5*...*n
        int inputNumber,total=1;
        //Input to number
        System.out.print("Sayıyı giriniz:");
        inputNumber=input.nextInt();
        //Factorial Calculating
        for (int i=1;i<=inputNumber;i++){
            total=i*total;
            System.out.println(total);
        } */


        
        // Combination Calculating   C(n,r)=n!/(r!*(n-r)!)
        int n,r,a,nFac=1,rFac=1,aFac=1,combination;

        //User input number
        n=input.nextInt();
        r=input.nextInt();
        a=n-r;

        //Calculation factorial n
        for(int i =1; i<=n;i++){
            nFac=nFac*i;
        }

        //Calculation factorial r
        for(int i=1; i<=r;i++){
            rFac=rFac*i;
        }

        //Calculation factorial a(n-r)
        for (int i=1;i<=a;i++){
            aFac=aFac*i;
        }
        combination=nFac/(rFac*aFac);
        System.out.println("Combination result:"+combination);






    }
}
