
package days40;


public class days40 {
    public static void main(String[] args) {
    
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Jumlah bilangan ganjil antara 1 hingga 100: " + sum);
        System.out.println("Rata-rata bilangan ganjil antara 1 hingga 100: " + average);
    }
}
