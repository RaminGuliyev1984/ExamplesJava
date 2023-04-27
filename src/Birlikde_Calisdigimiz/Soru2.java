package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru2 {
    //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char harf = scan.next().charAt(0);
        System.out.println("Please 3 letters after your entered:"
                + (char)(harf + 1) + "," + (char)(harf + 2) + "," +(char)(harf+3));


    }
}
