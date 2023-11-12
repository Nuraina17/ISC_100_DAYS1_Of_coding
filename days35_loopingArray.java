
package days35;


public class days35_loopingArray {
    public static void main(String[] args) {
      
        int[] numbers = {1, 2, 3, 4, 5};

       
        System.out.println("Looping menggunakan for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        
        System.out.println("\nLooping menggunakan enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}



