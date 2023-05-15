package Pratik;
import java.util.Arrays;
import java.util.Scanner;
public class Pratik20ATMProjesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String username,password;
        int count=3,select,balance=2000,price;

        while(count>0){
            System.out.print("Kullanıcı adınız:");
            username=input.nextLine();
            System.out.print("Parolanız:");
            password=input.nextLine();
            if (username.equals("admin") && password.equals("patika")){
                System.out.println("Patika bankasına hoşgeldiniz!!");
                do {
                    System.out.print("" +
                            "1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Bilgisi\n"+
                            "4-Çıkış\n"+
                            "Lütfen yapmak istediğiniz işlemi seçiniz:"
                    );
                    select=input.nextInt();

                    if (select==1){
                        System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                        price=input.nextInt();
                        balance+=price;
                    }else if(select==2){
                        System.out.print("Çekmek istediğiniz tutarı giriniz:");{
                            price=input.nextInt();
                            if(price>balance){
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance -= price;
                            }
                        }
                    }else if(select ==3){
                        System.out.println("--------------------");
                        System.out.println("Bakiyeniz:"+balance);
                        System.out.println("--------------------");
                    }
                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }else{
                System.out.println("Hatalı kullanıcı adı veya şifre");
                if (count==0){
                    System.out.println("3 kere hatalı kullanıcı adı veya şifre girdiğiniz için hesabınız bloke olmuştur.");
                }else {
                    System.out.println("Kalan hakkınız:"+--count);
                }
            }
        }




    }
}
