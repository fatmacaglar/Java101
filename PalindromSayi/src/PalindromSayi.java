import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            System.out.println("Number =>" + temp);
            lastNumber = temp % 10;
            System.out.println("Last Number => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("New Number => " + reverseNumber);
            temp /= 10;


        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrom(247);


    }
}
