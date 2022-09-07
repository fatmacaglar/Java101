import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, carpanToplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        sayi = input.nextInt();

        if (sayi < 0 ){
            System.out.println("Lutfen pozitif sayi giriniz : ");
        }

        for (int i = 1; i < sayi; i++){
            if ( sayi % i == 0);
            carpanToplam += i;
        }
        
        if (carpanToplam == sayi){
            System.out.println(sayi + " Mukemmel sayidir ");
        } else {
            System.out.println(sayi + " Mukemmel sayi degildir ");
        }
    }
}
