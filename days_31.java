
package days31;

import java.util.Scanner;


public class days_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int angka = scanner.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= angka; i++) {
            jumlah += i;
        }

        System.out.println("Jumlah semua angka dari 1 hingga " + angka + " adalah " + jumlah);
    }
}
    

