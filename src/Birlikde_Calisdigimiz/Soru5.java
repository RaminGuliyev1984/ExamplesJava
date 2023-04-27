package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter your variables,firs variable double,second variable int:");
        double sayi = scanner.nextDouble();
        int tamsayi = scanner.nextInt();

        int general = (int)(sayi/tamsayi);
        System.out.println("Please check your list:"+general);
    }
}
