import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumYili, kalan;
        String mesaj = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yilini Giriniz : ");
        dogumYili = input.nextInt();

        kalan = dogumYili %12;

        switch (kalan){
            case 0:
                System.out.print("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Kopek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Okuz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavsan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yilan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("Sıfırdan buyuk bir deger giriniz");
        }
        System.out.println("Cin Zodyagi Burcunuz  " + mesaj);
    }
}
