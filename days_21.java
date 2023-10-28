
package Days21;

import java.util.Scanner;

public class days_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Pilih bentuk geometri:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Persegi Panjang");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                // Persegi
                System.out.print("Masukkan panjang sisi: ");
                double s = input.nextDouble();
                double luasPersegi = s*s;
                System.out.println("Luas Persegi: " + luasPersegi);
                break;

            case 2:
                // Segitiga
                System.out.print("Masukkan alas: ");
                double alasSegitiga = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSegitiga = input.nextDouble();
                double luasSegitiga = 0.5 * alasSegitiga* tinggiSegitiga;
                System.out.println("Luas Segitiga: " + luasSegitiga);
                break;

            case 3:
                // Lingkaran
                System.out.print("Masukkan jari-jari: ");
                double jariLingkaran = input.nextDouble();
                double luasLingkaran = Math.PI * jariLingkaran * jariLingkaran;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                break;

            case 4:
                // Persegi Panjang
                System.out.print("Masukkan panjang: ");
                double panjangPersegiPanjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebarPersegiPanjang = input.nextDouble();
                double luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
                System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
    

