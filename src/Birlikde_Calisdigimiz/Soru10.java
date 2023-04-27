package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {

        //  Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //  “Sayi 5’in tam kati” yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter number:");
        int sayi = scanner.nextInt();

        if (sayi % 5 ==0){
            System.out.println("Please modulus 5:");
        }else{
            System.out.println("Please dont modulus 5");
        }
    }
}
