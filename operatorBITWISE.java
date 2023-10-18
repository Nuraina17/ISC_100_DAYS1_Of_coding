
package day10;


public class operatorBITWISE {
    public static void main(String[] args) {
        int a = 11;
        int b = 7;
        
        int resultAnd = a & b;
        System.out.println("a & b = " + resultAnd);
        
        int resultOr = a | b;
        System.out.println("a | b = " + resultOr);
        
        int resultXor = a ^ b;
        System.out.println("a ^ b = " + resultXor);
        
        int resultNotA = ~a;
        System.out.println(" ~a   = " + resultNotA);
    }
}
