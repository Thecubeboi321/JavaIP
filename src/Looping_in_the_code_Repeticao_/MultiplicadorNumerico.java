package Looping_in_the_code_Repeticao_;

import java.util.Scanner;

public class MultiplicadorNumerico {
    public static void main(String[] args) {  
        int cont, n, multi = 1;
        
        cont = 1;
        Scanner scan = new Scanner(System.in);
        
        while (cont <= 5) {
            System.out.println("Dijite Numeru: "+cont+" : ");
            n = scan.nextInt();
            multi = multi * n;
            cont++;
        }
        System.out.println("Total Somatorio mak: "+multi);
    }
}
