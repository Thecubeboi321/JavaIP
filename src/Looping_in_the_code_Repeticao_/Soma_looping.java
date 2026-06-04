package Looping_in_the_code_Repeticao_;

import java.util.Scanner;

public class Soma_looping {
    public static void main(String[] args) {
        //vars
        int i = 0, n, sPar = 0, sImpar = 0;
        int totPar = 0, totImpar = 0;
        
        //Scanner
        Scanner scan = new Scanner(System.in);
        
        while (i < 5) {
            System.out.print("Dijita numeru "+(i+1)+" : ");
            n = scan.nextInt();
            
            if (n % 2 == 0 ) {
                sPar = sPar + n;
                totPar += n;
                
                
            } else {
                sImpar = sImpar + 1;
                totImpar += 1;
            }
            i++;
        }
        System.out.println("-----------------------");
        System.out.println("Soma dos valores pares igual a "+sPar);
        System.out.println("Soma dos valores impar a "+sImpar);
        System.out.println("Soma dos valores Total do Par a "+totPar);
        System.out.println("Soma dos valores Total do impar a "+totImpar);
        
    }
    
}
