
package days22;

import java.util.Scanner;


public class days22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int a;
        int b;
       int angka= input.nextInt();
        
        if (angka % 2 == 0) {
            a = angka + 2;
            System.out.println("angka genap:" + a);
        } else if(angka % 2!=0){
            b = angka + 1; 
            System.out.println("angka ganjil:"+ b);
        }else{
            System.out.println("angka tidak valid");
        }
        
            }
}
    

