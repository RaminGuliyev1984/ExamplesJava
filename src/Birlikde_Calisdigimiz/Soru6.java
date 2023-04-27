package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
          // kullanicidan bir sayi isledin/
          // girilen sayinin 2 katini yazin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");

        int sayi = scanner.nextInt();
        sayi = sayi*2;
        System.out.println("Result :"+sayi);
      }
}
