import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(sonUcHarfDondurenMetod());

    }

    public static String sonUcHarfDondurenMetod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime dizisinin boyutunu giriniz:");
        int boyut = scanner.nextInt();
        String[] arr = new String[boyut];
        String enUzunKelime = arr[0];

        for (int i = 0; i <= boyut; i++) {
            System.out.println("Lutfen arr elemanlarini giriniz:");
            String kelime = scanner.nextLine();
            if (arr[i].length() > enUzunKelime.length()) {
                enUzunKelime = arr[i];
            }

        }
        String sonUcHarf = (enUzunKelime.substring(enUzunKelime.length() - 3));
        return sonUcHarf;
    }
}
