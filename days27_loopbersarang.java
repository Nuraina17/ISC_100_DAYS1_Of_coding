
package days27;


public class days27_loopbersarang {
    public static void main(String[] args) {
       int tinggi = 4; 

        for (int i = 1; i <= tinggi; i++) {
           
            for (int j = tinggi - i; j > 5; j--) {
                System.out.print(" ");
            }

           
            for (int k = 0; k <= 1 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    

