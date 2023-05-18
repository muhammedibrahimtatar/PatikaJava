import java.util.Scanner;
public class Odev12RecursiveAsalSayiBul {
    static boolean isPrime(int number, int i){
        // 0 and 1 are not prime numbers.
        if(number==0 || number==1){
            return false;
        }
        else{
            if(number%i==0){
                if(i==1){
                    return isPrime(number,i+1);
                }else if(number==i){
                    return true;
                }else{
                    return false;
                }
            } else{
                return isPrime(number,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n=inp.nextInt();
        if(isPrime(n,1)){
            System.out.println(n + " is prime number.");
        }else {
            System.out.println(n + " is not prime number.");
        }
    }
}