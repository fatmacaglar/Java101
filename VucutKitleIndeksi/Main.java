import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        double kilo;
        double vucutkitleIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz (metre) : ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu Giriniz (kilo) : ");
        kilo = input.nextDouble();

        vucutkitleIndeksi= kilo / (boy * boy);
        System.out.println("vucutkitleIndeksi : ");
        System.out.println("boyunuz : " + boy);
        System.out.println("kilonuz : " + kilo);
        System.out.println("vucutkitleIndeksi : " + vucutkitleIndeksi);
        
    }
}