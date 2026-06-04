
package Operadores;

import java.util.Scanner;

public class Operation_Numeric {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
                
    //Variables
    int a = 2, b = 3, c = 5;       
    
    //with Scanner
        System.out.print("");
    a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
    
    
    //Operations
    System.out.println(a+" > "+b+" : "+(a>b));
    System.out.println(a+" == "+b+" : "+(a==b));
    System.out.println(a+" <= "+b+" : "+(a<=b));
    System.out.println(c+" = "+a+" + "+b+" : "+(c=a+b));
    System.out.println(c+" >= "+b+" ^ "+a+" : "+(c>=Math.pow(b, a)));
    
    }
    
}
