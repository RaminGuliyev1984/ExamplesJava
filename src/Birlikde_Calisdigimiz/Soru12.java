package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli pozitif bir tamsayi alip
        // sayinin rakamlar toplamini yazdirin
        // ornegin 213 girildiginde 6 yazdirsin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter 3 digit number:");
        int number = scanner.nextInt();

        int onesDigit = 0;
        int sum = 0;

        onesDigit = number % 10;
        sum = sum + onesDigit;

        number = number / 10;
        onesDigit = number % 10;

       sum = sum + onesDigit;

        number = number / 10;
        onesDigit= number % 10;

         sum= sum + onesDigit ;

        System.out.println("Please enter sum number:" +sum);


    }
}
