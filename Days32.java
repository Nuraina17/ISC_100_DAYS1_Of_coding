
package array32;


public class Days32 {
    public static void main(String[] args) {
       
        int[] angka = new int[5];
        angka[0] = 10;
        angka[1] = 20;
        angka[2] = 30;
        angka[3] = 40;
        angka[4] = 50;

        System.out.println("Elemen array pada indeks 0: " + angka[0]);
        System.out.println("Elemen array pada indeks 2: " + angka[2]);

        int jumlahElemen = angka.length;
        System.out.println("Jumlah elemen dalam array: " + jumlahElemen);

        System.out.println("Semua elemen dalam array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
}

    

