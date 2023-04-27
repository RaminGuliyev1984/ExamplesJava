package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

             //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
              //isleminin sonucununun tamsayi kismini yazdirin.

        System.out.println("Please enter  2 double variable:");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int tamsayi = (int)(sayi1/sayi2);
        System.out.println("Result:"+tamsayi);


    }
}
