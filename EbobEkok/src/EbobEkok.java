import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, kucukSayi, buyukSayi;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        n2 = input.nextInt();
        int ebob = 1;
        int ekok = 1;

        if (n1 < n2){
            kucukSayi = n1;
            buyukSayi = n2;
        } else {
            kucukSayi = n2;
            buyukSayi = n1;
        }
        for (int i= 1; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("EKOK : " +i);
                break;
            }
        }
        for (int i = 1; i <= (n1 * n2); i++){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("EBOB: " +i);
                break;
            }
        }
    }
}
