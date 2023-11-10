
package days33;


public class days33_array_3dimensi {
    public static void main(String[] args) {
       int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        
        System.out.println(array2D[0][0]); 
        System.out.println(array2D[1][2]); 

        
        array2D[2][1] = 10;
        System.out.println(array2D[2][1]); 

       
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
    