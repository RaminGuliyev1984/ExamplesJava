package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
//Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
//ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a variable:");
        int sayi = scan.nextInt();


        byte byteSayi = (byte) Math.max(Math.min(sayi,127),-128);
        System.out.println("The number entered is between -128 and 127:" + byteSayi);


    }
}
