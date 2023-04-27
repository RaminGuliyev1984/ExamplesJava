package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
      //  Soru 7 (Interview)- Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 variables");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int temp  =0;
        temp= sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println("Please enter mix variables:" +sayi1+ " " +sayi2);


    }
}
