import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0){
            System.out.print("Kullanici Adinizi Giriniz : ");
            username = input.nextLine();
            System.out.print("Sifrenizi Giriniz : ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, X baknasina Hosgeldiniz! ");
                do {
                    System.out.println("1- Para Yatirma\n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.print("Yatirilacak Tutari Giriniz : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2){
                        System.out.print("Cekilecek Para Miktarini Giriniz :  ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.print("Bakiye Yetersiz!");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                }while (select != 4);
                System.out.println("Tekrardan Gorusmek Dilegiyle!");
                break;
            } else {
                --right;
                System.out.println("Hatali kullanici adi veya sifre, tekrar deneyiniz!");
                if (right == 0){
                    System.out.println("Hesabiniz bloke olmustur, banka ile iletisime geciniz!");
                } else {
                    System.out.println("Kalan Hakiniz " + right );
                }
            }
        }
    }
}
