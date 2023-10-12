package DAYS4_;

import java.util.Scanner;

public class INPUTCONSOLE {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukkan nama : ");
        String nama = scanner.nextLine();
        System.out.println("masukkan kelas: ");
        String kelas = scanner.nextLine();
        System.out.println("masukkan nim  : ");
        String nim = scanner.nextLine();
        
        System.out.println("saya telah memasukkan: ");
        System.out.println("Nama : " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nim  : " + nim);
    }
}
