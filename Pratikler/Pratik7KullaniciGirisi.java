package Pratik;
import java.util.Scanner;
public class Pratik7KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String username,password;

        System.out.print("Kullanıcı adınızı giriniz:");
        username=input.nextLine();

        System.out.print("Şifrenizi giriniz:");
        password=input.nextLine();

        //String için .equals("") kullanıyoruz
        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Hatalı kullanıcı adı ve şifre");

        }

    }
}
