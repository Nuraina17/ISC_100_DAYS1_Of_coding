
package days_13;

import java.util.Scanner;


public class operatorAritmatika {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double num1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double num2 = input.nextDouble();

       
        double sum = num1 + num2;
        System.out.println("Hasil penjumlahan: " + sum);

       
        double product = num1 * num2;
        System.out.println("Hasil perkalian: " + product);

       
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Hasil pembagian: " + quotient);
        } else {
            System.out.println("Tidak bisa membagi dengan nol.");
        }

       
        if (num2 != 0) {
            double remainder = num1 % num2;
            System.out.println("Sisa pembagian: " + remainder);
        } else {
            System.out.println("Tidak bisa menghitung sisa pembagian dengan nol.");
        }

        input.close();
    }
}
   