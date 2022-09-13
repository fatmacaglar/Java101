import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oncekiSayi = 0, simdikiSayi = 1, sonrakiSayi = 0;
        System.out.print("Fibonacci serisinin eleman sayısini giriniz: ");
        int elemanSayisi =input.nextInt();

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(oncekiSayi + " ");

            sonrakiSayi = simdikiSayi + oncekiSayi;
            oncekiSayi = simdikiSayi;
            simdikiSayi = sonrakiSayi;

        }
    }
}
