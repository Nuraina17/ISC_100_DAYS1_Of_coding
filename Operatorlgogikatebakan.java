
package DAYS11;

import java.util.Scanner;

public class Operatorlgogikatebakan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        
        int angka = scanner.nextInt();
        
        boolean isPositif = angka > 0;
        boolean isNegatif = angka < 0;
        boolean isNol = angka == 0;
        
        System.out.println("Apakah angka ini positif? " + isPositif);
        System.out.println("Apakah angka ini negatif? " + isNegatif);
        System.out.println("Apakah angka ini nol?     " + isNol);
        
        
        
        
    }
}
