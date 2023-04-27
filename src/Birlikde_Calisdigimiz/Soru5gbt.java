package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru5gbt {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Birinci sayıyı girin: ");
            double sayi1 = input.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            int sayi2 = input.nextInt();

            double bolum = sayi1 / sayi2;
            int tamsayi = (int) bolum;

            System.out.println("İşlem sonucunun tam sayı kısmı: " + tamsayi);
        }
    }


