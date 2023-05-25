package Odevler;
import java.util.Arrays;
import java.util.Scanner;

public class Odev14DiziKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,tempNumber=0;
        System.out.print("Dizinin boyutu n:");
        n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print(i+". Elemanı:");
            arr[i]+=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
