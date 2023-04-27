package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
     //   Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
      //  NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
       //         Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a name:");
        char letter = scan.next().toLowerCase().charAt(0);

        String month="";
        if(letter == 'j' || letter =='J'){
            month = "January";
        } else if(letter == 'a' || letter =='A'){
            month = "August";
        } else if(letter == 'd'|| letter== 'D'){
            month = "December";
        }else{
            System.out.println("Error");
            return;
        }
        System.out.println(letter+ "start with month:" +month);
    }
}
