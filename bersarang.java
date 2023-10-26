
package days18;

import java.util.Scanner;

public class bersarang {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka > 0) {
            System.out.println("Angka yang Anda masukkan adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka yang Anda masukkan adalah negatif.");
        } else {
            System.out.println("Angka yang Anda masukkan adalah nol.");
        }

        // Jangan lupa untuk menutup Scanner
        scanner.close();
    }
}
    

