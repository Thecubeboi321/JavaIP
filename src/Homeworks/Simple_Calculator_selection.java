package Homeworks;

import java.util.Scanner;

public class Simple_Calculator_selection {
    public static void main(String[] args) {
        //Scaner
        Scanner s = new Scanner(System.in);
        
        //Variables
        int option;
        char symbol = 0;
        int num1, num2; 
        double result = 0;
         
        //values                      
        System.out.print("Hili valor(Numeru) primeiru: ");
        num1 = s.nextInt();
        System.out.print("Hili valor(Numeru) segundo: ");
        num2 = s.nextInt();
        
        //Selections
        System.out.println("===========Kalkulator Menu===========");
        System.out.println("      [1] Adisaun(+)");
        System.out.println("      [2] Substrasaun(-)");
        System.out.println("      [3] Multiplikasaun(x)");
        System.out.println("      [4] Dividir(/)");
        System.out.println("=====================================");
        
        //Options
        System.out.print("Hili ita atu Halo saida ho numeru sira foin ita tau: ");
        option = s.nextInt();
        
        switch (option) {
            case 1: 
                result = num1 + num2;
                symbol = '+';
                break;
            case 2:
                result = num1 - num2;
                symbol = '-';
                break;
            case 3:
                result = num1 * num2;
                symbol = 'x';
                break;
            case 4:
                result = num1 / num2;
                symbol = '/'; 
                break;
            default:
                System.out.println("Numeru "+option+" ne'e la validu!!");
        }
        System.out.println("");
        System.out.println("Kalkulasaun husi "+num1 + symbol + num2+" mak "+result);
    }
    
}
