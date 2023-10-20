
package Days12;

import java.util.Scanner;



public class ContohOperatorAritmatika {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan kemeja: ");
        int jumlahPesanan = input.nextInt();

        System.out.print("Masukkan jumlah kemeja yang diproduksi setiap hari: ");
        int jumlahKemejaPerHari = input.nextInt();

        int jumlahKotakTerisi = jumlahPesanan / jumlahKemejaPerHari;
        int sisaKotak = jumlahPesanan % jumlahKemejaPerHari;

        System.out.println("Jumlah kotak yang terisi: " + jumlahKotakTerisi);
        System.out.println("Sisa kotak yang belum terisi kemeja: " + sisaKotak);
    }
}  
        
    

