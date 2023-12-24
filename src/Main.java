import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, total = 0;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            k = scn.nextInt();
            if (k % 4 == 0)
                total += k;
        } while (k % 2 == 0);

        System.out.println("4'e tam bölünen sayıların toplamı : " + total);
    }
}