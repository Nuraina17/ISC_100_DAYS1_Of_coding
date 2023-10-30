
package days22;

import java.util.Scanner;


public class days22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        if (angka % 2 == 1) {
            angka = angka + 1; 
        } else {
            angka = angka + 2; 
        }
        
        System.out.println("Hasil: " + angka);
    }
}
    

