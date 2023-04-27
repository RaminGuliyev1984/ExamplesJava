package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru1 {
    //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
    //yazin.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter 3 variables:");


        int a= scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double toplam =((a+b+c)/3);

        System.out.println("Uc degerin ortalamasi:"+toplam);
    }
}
