import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int KM;
        double perKM = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz : ");
        KM = input.nextInt();

        total = (KM * perKM);
        total += startPrice;

        total = (total < 15) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);

    }
}