package Pratik;
/* Palindrom sayılar baştan veya sonran okunduğunda aynı olan sayılardır. 101,222,53535,404...
* */
public class Pratik22PalindromSayiBulma {
    static boolean isPalindrom(int number){
        int temp = number,reverseNumber=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp /=10;
        }
        if (number==reverseNumber){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(2552));
    }
}
