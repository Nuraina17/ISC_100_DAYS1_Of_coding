
package days34;

import java.util.Scanner;


public class days_34 {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

       
        System.out.print("Size array: ");
        int size = input.nextInt();
        
        int[] array = new int[size];

        
        
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]"); 
    }
}


