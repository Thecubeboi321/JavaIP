package ip_2026;

import java.util.Scanner;

// THis is for Dominica 
public class Dominica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //inputs
        String naran1;
        int tinan;
        char sexu;
        double todan;
        double altura;
        
        
        
        //outputs
        System.out.print("Priense Naran: ");
        naran1 = input.nextLine();
        
        System.out.print("Priense Tinan: ");
        tinan = input.nextInt();
        
        System.out.print("Sexu: ");
        sexu = input.next().charAt(0);   
        
        System.out.print("Priense Todan (KG): ");
        todan = input.nextDouble();
        
        System.out.print("Priense Altura (CM): ");
        altura = input.nextDouble();
       
        //Results
        
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("Ita nia naran: "+naran1);
        System.out.println("Ita nia tinan: "+tinan+" Anos");
        System.out.println("Ita nia sexu: "+sexu);
        System.out.println("Ita nia todan: "+todan+" Kg");
        System.out.println("Ita nia altura: "+altura+" Cm");
    }
}


