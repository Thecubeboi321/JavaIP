import java.util.Scanner;

public class Trabalho_calculasaun_ho_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    //Data types
    int a, b, c;
    
    //Preview
        System.out.println("Sei halo komparasaun entre valor sira (True/False):");
        System.out.println("a > b");
        System.out.println("a < b");
        System.out.println("a == b");
        System.out.println("a != b");
        System.out.println("a <= b");
        System.out.println("c = a + b=");
        System.out.println("c >= b^a ");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        
    //Inputs
        System.out.print("Hatama valor a: ");
        a = input.nextInt();
        
        System.out.print("Hatama valor b: ");
        b = input.nextInt();
                
        System.out.print("Hatama valor c: ");
        c = input.nextInt();
                
    //Operations
    System.out.println(a+" > "+b+" : "+(a>b));
    System.out.println(a+" < "+b+" : "+(a<b));
    System.out.println(a+" = "+b+" : "+(a==b));
    System.out.println(a+" <= "+b+" : "+(a<=b));
    System.out.println(a+" <= "+b+" : "+(a!=b));
    System.out.println(c+" = "+a+" + "+b+" : "+(c==(a+b)));
    System.out.println(c+" >= "+b+"^"+a+" : "+(c>=Math.pow(b, a)));
    }   
}
