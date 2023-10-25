
package DAYS_17;

import java.util.Scanner;


public class IF_ELSE {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam (00-23): ");
        int jam = input.nextInt();

        if (jam >= 5 && jam <= 10) {
            System.out.println("Waktu pagi.");
        } else if (jam >= 11 && jam <= 13) {
            System.out.println("Waktu siang.");
        } else if (jam >= 14 && jam <= 18) {
            System.out.println("Waktu sore.");
        } else if ((jam >= 19 && jam <= 23) || (jam >= 0 && jam <= 4)) {
            System.out.println("Waktu malam.");
        } else {
            System.out.println("Jam yang dimasukkan tidak valid.");
        }
    }

    }
 
    


   

