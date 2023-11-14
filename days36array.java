
package days36;


public class days36array {
    public static void main(String[] args) {
        int[] angka = {5, 2, 9, 1, 3};

        System.out.println("Jumlah elemen array: " + angka.length);

        System.out.println("Elemen array terbalik:");
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.println(angka[i]);
        }

        angka[2] = 7;

        System.out.println("Elemen array setelah perubahan:");
        for (int num : angka) {
            System.out.println(num);
        }
    }

}


