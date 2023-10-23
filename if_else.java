
package days15;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang! Apakah Anda suka warna merah atau biru?");
        String pilihanWarna = input.nextLine();

        if (pilihanWarna.equalsIgnoreCase("merah")) {
            System.out.println("Anda memilih warna merah, warna ini melambangkan keberanian!");
        } else if (pilihanWarna.equalsIgnoreCase("biru")) {
            System.out.println("Anda memilih warna biru, warna ini melambangkan ketenangan!");
        } else {
            System.out.println("Anda memilih warna lain, warna apa yang Anda sukai?");
            String warnaLain = input.nextLine();
            System.out.println("Anda suka warna " + warnaLain + ", itu juga warna yang indah!");
        }

        input.close();
    }
}
   
