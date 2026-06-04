package ip_2026;


import java.util.Scanner;

public class Operador_scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Input
        
        // System.out.print("Prense Naran: ");
        
        String Naran1;
        int idade;
        
        System.out.print("Prense Naran: "); // ida nee nextline
        Naran1 = s.nextLine();
        
        System.out.print("Prense Idade: "); // ida nee nextline maibe ho numeru
        idade = s.nextInt();
        
        // Output
        
        // System.out.println("Naran Ho Next: "+Naran1);
        
        System.out.println("Naran ho Nextline: "+Naran1);
        
        System.out.println("Naran ho NextInt: "+idade);
        
    }
}