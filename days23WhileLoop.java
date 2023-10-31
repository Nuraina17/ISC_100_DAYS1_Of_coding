
package days23;

public class days23WhileLoop {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;

        while (i <= rows) {
            int j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= rows - i + 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
    

