package OperatorPerulangan;

import java.util.Scanner;


public class Days_14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Anda memasukkan angka genap!");
        } else if (angka % 3 == 0) {
            System.out.println("Angka ini adalah kelipatan 3!");
        } else if (angka == 7) {
            System.out.println("Angka keberuntungan!");
        } else if (angka < 0) {
            System.out.println("Angka negatif? Anda memang berbeda!");
        } else {
            System.out.println("Angka yang menarik!");
        }

        scanner.close();
    }
}
        
    

