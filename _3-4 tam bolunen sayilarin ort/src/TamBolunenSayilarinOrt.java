import java.util.Scanner;

public class TamBolunenSayilarinOrt {

    // 3 ve 4'e tam bölünen sayilarin ortalamalari

    public static void main(String[] args) {
        int sayi, toplam = 0, bolunenSayilar=0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        sayi = inp.nextInt();

        for (int i = 1; i< sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                toplam += i;
                bolunenSayilar++;
            }
        }
        ortalama = toplam / (bolunenSayilar - 1);
        System.out.println("Bolunebilen Sayilarin Ortalamasi : " + ortalama);
    }
}
