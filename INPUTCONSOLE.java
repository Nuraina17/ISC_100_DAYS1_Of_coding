package DAYS4_;

import java.util.Scanner;

public class INPUTCONSOLE {
    public static void main(String[] args) {
        String nama;
        String nim;
        String kelas;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("inputkan nama : ");
        nama = scanner.nextLine();
        System.out.println("inputkan nim  : ");
        nim= scanner.nextLine();
        System.out.println("inputkan kelas:");
        kelas =scanner.nextLine();
        
        System.out.println("nama saya adalah :" + nama);
        System.out.println("nim saya: " + nim);
        System.out.println("kelas saya: "+ kelas);
    }
}
