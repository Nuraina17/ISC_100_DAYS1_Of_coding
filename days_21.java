
package days21;

import java.util.Scanner;


public class days_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        String hasil = (bilangan % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Bilangan ini adalah " + hasil + ".");
        
    }

    }

