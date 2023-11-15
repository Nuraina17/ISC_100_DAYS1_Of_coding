
package days38;


public class array_multi_dimensi {
    public static void main(String[] args) {
       
        
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

       
        int elemen = array2D[1][2];
        System.out.println("Elemen pada baris ke-1 dan kolom ke-2: " + elemen);

        
        array2D[0][1] = 10;

        
        System.out.println("Semua elemen array:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}



