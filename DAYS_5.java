
package BISAA;

import java.util.Scanner;

public class AINA {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nomor Peserta: ");
        String nomorPeserta = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin: ");
        String jenisKelamin = scanner.nextLine();
        
        System.out.print("masukkan umur: ");
        int umur = scanner.nextInt();
        
        System.out.print("Masukkan Berat Badan(kg): ");
        Double beratBadan = scanner.nextDouble();
        
        System.out.print("Masukkan Status Keaktifan (Aktif/Nonaktif): ");
        Boolean statusKeaktifan = scanner.hasNextBoolean();
        
        System.out.println("Nomor Peserta:" + nomorPeserta );
        System.out.println("Nama:" + nama);
        System.out.println("Jenis Kelamin:" + jenisKelamin);
        System.out.println("umur:" + umur);
        System.out.println("Berat Badan:" + beratBadan);
        System.out.println("Status Keaktifan:" + statusKeaktifan);
        
        
    }
}
