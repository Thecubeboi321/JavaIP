package ip_2026;

import java.util.Scanner;

public class Calkulaytoer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Variables
        double num1;
        double num2;    
        double adisaun, divi, subs, multi;
        
        //Input
        System.out.print("Prense Numeru Primeiru: ");    
        num1 = s.nextInt();
        System.out.print("Prense Numeru Segundu: ");    
        num2 = s.nextInt();
        //System.out.print("Prense Ekuasaun: ");    
        //proses = s.nextInt();
        
        //Proccess
        adisaun = num1 + num2;
        subs = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2; 
       
        //Output
        System.out.println("Resultadu Husi: " +num1+" + "+num2+ " = " +adisaun);
        System.out.println("Resultadu Husi: " +num1+" - "+num2+ " = " +subs);
        System.out.println("Resultadu Husi: " +num1+" x "+num2+ " = " +multi);
        System.out.println("Resultadu Husi: " +num1+" / "+num2+ " = " +divi);
    }
}
