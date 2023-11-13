
package days36;

import java.util.Scanner;


public class days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int jumlahKolom = input.nextInt();

        int[][] array = new int[jumlahBaris][jumlahKolom];

        int counter = 1;

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                array[i][j] = counter;
                counter++;
            }
        }

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(array[i][j]);

                if (j < jumlahKolom - 1) {
                    System.out.print(" ");
                }
            }

            if (i < jumlahBaris - 1) {
                System.out.println();
            }
        }
    }
}