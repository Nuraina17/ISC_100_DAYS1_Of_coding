
package days_16;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Anda memilih angka 1.");
                break;
            case 2:
                System.out.println("Anda memilih angka 2.");
                break;
            case 3:
                System.out.println("Anda memilih angka 3.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        scanner.close();
    }
}
    
