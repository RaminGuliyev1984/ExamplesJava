package Birlikde_Calisdigimiz;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        //Kullanicidan ismini isteyib ismi buyuk harfe kayd edin
        // sonra kullaniciya yeni halini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String isim = scanner.nextLine().toUpperCase();

        System.out.println("Name: "+ isim);


    }
}
