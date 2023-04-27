
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz:");
        String kullaniciadi = scan.nextLine();


        System.out.println("Lutfen soyadinizi giriniz:");
        String kullanicisoyadi = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz:");
        String yas = scan.nextLine();


        System.out.println("Lutfen takiminizi giriniz:");
        String takim = scan.nextLine();


        System.out.println(" kullaniciadi " + kullaniciadi + " kullanicisoyadi " + kullanicisoyadi +" yas " + yas + " takim " + takim);


    }
}
