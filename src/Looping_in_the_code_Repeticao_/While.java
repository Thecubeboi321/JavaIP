package Looping_in_the_code_Repeticao_;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
            //Vars
            int i = 0, soma = 0, n, maior = 0;
            
            //Scanner
            Scanner s = new Scanner(System.in);
            
            //Operation
            while (i < 5) {
                System.out.print("Dijita numeru "+(i+1)+" nian! : ");
                n = s.nextInt();
                if (n > maior) {
                    maior = n;
                }
                soma += n;// soma - soma + n;
                i++;    
            }
            System.out.println("----------------------------------");
            System.out.println("Soma dos valores igual a "+soma);
            System.out.println("Numeru maior igual a "+maior);
    }
    
}
