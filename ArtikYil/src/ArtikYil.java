import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean artikYil = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        yil = sc.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    artikYil = true;
                } else {
                    artikYil = false;
                }
            } if (artikYil){
                System.out.println("yili artik bir yildir ! " + yil);
            } else {
                System.out.println("yili artik bir yil degildir ! " + yil);
            }
        }
    }
}
