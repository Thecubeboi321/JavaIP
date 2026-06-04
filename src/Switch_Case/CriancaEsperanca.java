
package Switch_Case;

import java.util.Scanner;

public class CriancaEsperanca {
    public static void main(String[] args) {
        //Variabels
        char opsaun;
        double value = 0;
        
        //Scanner
        Scanner s = new Scanner(System.in);
        
        //Selections
        System.out.println("=========================");
        System.out.println("   [A] Doasaun $10");
        System.out.println("   [B] Doasaun $19");
        System.out.println("   [C] Doasaun $21");
        System.out.println("   [D] Doasaun $25");
        System.out.println("   [E] Doasaun $50");
        System.out.println("   [F] Doasaun $67");
        System.out.println("   [G] Ense rasik");
        System.out.println("   [H] Kansela");
        System.out.println("=========================");
        
        //Options
        System.out.println("Eskolha Opsaun ba Doasaun: ");
        opsaun = s.next().charAt(0);
        
        //Option functions
        switch (opsaun) {
            case 'A': 
                value = 10;
                break;
            case 'B':
                value = 19;
                break;
            case 'C':
                value = 21;
                break;
            case 'D':
                value = 25;
                break;
            case 'E':
                value = 50;
                break;
            case 'F':
                value = 67;
                break;
            case 'G':    
                System.out.print("Dijite Montante Doasaun Seluk: ");
                value = s.nextDouble();
                break;
            case 'H':
                System.out.println("Ita kansela ona Doasaun(jahat sekali kau)");
            default:
                System.out.println("Opsaun "+opsaun+" Invalidu!!");
        }
        System.out.println("=============================================");
        System.out.println("Ita halo Doasaun ho Montante "+value);
        System.out.printf("Ita halo Doasaun ho Montante $%.2f \n",value); //Formatu ba valor osan
        System.out.println("=============================================");
        
    }
    
}
