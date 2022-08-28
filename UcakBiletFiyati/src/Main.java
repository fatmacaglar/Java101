import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, travelType;
        double perKm = 0.10, tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();

        System.out.print("Yasinizi Giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus) : ");
        travelType= input.nextInt();

        if ((age > 0 && km > 0 ) && (travelType == 1 || travelType == 2 )){
        } else {
            System.out.println("Hatali veri girdiniz");
        }

        switch (travelType) {
            case 1:
                tutar = km * perKm;
                if (age < 12) {
                    System.out.println("Indirimsiz toplam tutar  : " + tutar);
                    tutar = tutar * (0.50);
                    System.out.println("12 yasindan kucuk indirimli toplam tutar (0.50) : " + tutar);

                } else if (age > 12 && age < 24) {
                    System.out.println("Indirimsiz toplam tutar : " + tutar);
                    tutar = tutar * (0.10);
                    System.out.println("12-24 yas araligindaki indirimli toplam tutar (0.10) : " + tutar);

                } else if (age > 65) {
                    System.out.println("Indirimsiz toplam tutar : " + tutar);
                    tutar = tutar * (0.30);
                    System.out.println("65 yasindan buyuk indirimli toplam tutar (0.30): " + tutar);
                }
                break;
            case 2:
                if (age < 12) {
                    tutar = km * perKm;
                    tutar = tutar * (0.50);
                    System.out.println("12 yasindan kucuk indirimli toplam tutar (0.50) : " + tutar);
                    tutar = tutar * (0.20);
                    System.out.println("Gidis-Donus %20 indirimli tutar : " + tutar);

                } else if (age > 12 && age < 24) {
                    tutar = km * perKm;
                    tutar = tutar * (0.10);
                    System.out.println("12-24 yas arasi indirimli toplam tutar (0.10) : " + tutar);
                    tutar = tutar * (0.20);
                    System.out.println("Gidis - Donus %20 indirimli tutar : "+ tutar);

                } else if (age > 65) {
                    tutar = km * perKm;
                    tutar = tutar * (0.30);
                    System.out.println("65 yaş ve üzeri için indirimli toplam tutar (%30) :  "+ tutar);
                    tutar = tutar * (0.20);
                    System.out.println("Gidiş - Dönüş %20 indirimli tutar : "+ tutar);
                }
                else{
                    tutar = km * perKm;
                    tutar = tutar * (0.20);
                    System.out.println("toplam tutar (%20 indirimli) : "+ tutar);
                }
                break;
        }
    }
}
