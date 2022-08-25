import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat =5.00;

        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        double toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("armutun kg fiyatını giriniz : ");
        armutKilo = input.nextDouble();

        System.out.println("elmanın kg fiyatını giriniz : ");
        elmaKilo = input.nextDouble();

        System.out.println("domatesin kg fiyatını giriniz : ");
        domatesKilo = input.nextDouble();

        System.out.println("muzun kg fiyatını giriniz : ");
        muzKilo = input.nextDouble();

        System.out.println("patlıcanın kg fiyatını giriniz : ");
        patlicanKilo = input.nextDouble();


        toplamTutar = armutFiyat*armutKilo + elmaFiyat*elmaKilo + domatesFiyat*domatesKilo + muzFiyat*muzKilo +patlicanFiyat*patlicanKilo;

        System.out.println("| Armutun Fiyatı ve Kilosu     :| "+armutFiyat+" ve "+armutKilo );
        System.out.println("| Elmanın Fiyatı ve Kilosu     :| "+elmaFiyat+" ve "+elmaKilo);
        System.out.println("| Domates Fiyatı ve Kilosu     :| "+domatesFiyat+" ve "+domatesKilo);
        System.out.println("| Muzun Fiyatı ve Kilosu       :| "+muzFiyat+" ve "+muzKilo);
        System.out.println("| Patlıcanın Fiyatı ve Kilosu: | "+patlicanFiyat+" ve "+ patlicanKilo);
        System.out.println("| Toplam Tutar                 :| "+toplamTutar);

    }

}