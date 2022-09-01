import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r;
        int kombinasyon;

        Scanner input = new Scanner(System.in);
        System.out.print(" n elemani sayisi giriniz : ");
        n = input.nextInt();

        System.out.print(" r elemani sayisini giriniz : ");
        r = input.nextInt();

        if (n < 0 || r < 0 ){
            System.out.println(" Hatali giris, lutfen pozitif sayi giriniz");

        }
        int total = 1;
        for (int i = 1; i <= n; i++){
            total = total * i;
        }

        int total2 = 1;
        for (int i = 1; i <= r; i++){
            total = total * i;
        }

        int total3= 1;
        for (int i = 1; i <= n-r; i++){
            total = total * i;
        }
        kombinasyon = total / (total2 * total3);
        System.out.println("n sayisinin r'li kombinasyonu : " + kombinasyon);
    }
}
