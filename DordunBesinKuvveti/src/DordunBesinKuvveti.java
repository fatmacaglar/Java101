import java.util.Scanner;

public class DordunBesinKuvveti {
    public static void main(String[] args) {
        int sayi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        sayi = inp.nextInt();

        System.out.println( sayi + " sayisindan kucuk dortun kuvvetleri ");

        for (int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println(sayi + " sayisindan kucuk besin kuvvetleri ");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i + " ");
        }
    }
}
