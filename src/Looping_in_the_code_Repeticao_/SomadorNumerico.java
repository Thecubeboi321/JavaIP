package Looping_in_the_code_Repeticao_;

import java.util.Scanner;

public class SomadorNumerico {
    public static void main(String[] args) {
        int cont, n, soma =0;
        
        cont = 1;
        Scanner scan = new Scanner(System.in);
        
        while (cont <= 5) {
            System.out.println("Dijite Numeru: "+cont+" : ");
            n = scan.nextInt();
            soma = soma + n;
            cont++;
        }
        System.out.println("Total Somatorio mak: "+soma);
    }
    
}
