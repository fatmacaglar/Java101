import java.util.Scanner;

public class PozitifTekSayiBul {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Sayi Giriniz : ");
            sayi = inp.nextInt();
            if (sayi % 2 == 1) {
                toplam += toplam + sayi;
            }
        } while (0 < sayi);
        System.out.println("Girilen Sayilarin Toplami : " + toplam);
    }
}
