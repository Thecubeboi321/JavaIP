package reviusion_exam;

import java.util.Scanner;

public class Exam_2 {
    public static void main(String[] args) {
        //Vars
        final double REQ_TRAB = 0.1; // THis eclare a double anbd to test file changes
        final double REQ_EM = 0.4;  // This is Exame medio 
        final double REQ_EF = 0.5;  // This is exame Final 
                
        double valorTrab, valorEM, valorEF, somTot, somaTotal;
        String naran_est, disc;
        int totEst, i = 1, totalPassa = 0, totalLaPassa = 0, totalRek = 0;;
        
        //Scanner
        Scanner s = new Scanner(System.in);
        
        //Operations
        System.out.print("Dijite Total Estudante: ");
        totEst = s.nextInt();
        
        
        while (i <= totEst) {            
            System.out.print("Dijite Naran Estudante: ");
            naran_est = s.next();
            System.out.print("Dijite Valor Trabalhu: ");
            valorTrab = s.nextDouble();
            System.out.print("Dijite Ezame Media: ");
            valorEM = s.nextDouble();
            System.out.print("Dijite Ezame Final: ");
            valorEF = s.nextDouble();
            System.out.println("=======================================");
            
            //Calculations
            valorTrab = valorTrab * REQ_TRAB;
            valorEM = valorEM * REQ_EM;
            valorEF = valorEF * REQ_EF;
            somaTotal = valorTrab + valorEM + valorEF;
            
            System.out.printf("Valor Total :%.1f\n" , somaTotal);
          
            
        
        if (somaTotal >= 8.5 && somaTotal <= 10 ) {
            totalPassa++;
            System.out.println("Quantidade: A");
        } else if (somaTotal >= 7) {
            totalPassa++;
            System.out.println("Quantidade: B");
        } else if (somaTotal >= 5.5) {
            totalPassa++;
            System.out.println("Quantidade: C");
        } else if (somaTotal >= 4) {
            totalRek++;
            System.out.println("Quantidade: D");
        } else if (somaTotal >= 0) {
            totalLaPassa++;
            System.out.println("Quantidade: E");
        }
            System.out.println("=========================================");
        i++;
        }
        
        System.out.println("Total Estudante: "+totEst);
        System.out.println("Total Passa: "+totalPassa);
        System.out.println("Total La Passa: "+totalLaPassa);
        System.out.println("Total Rekursu: "+totalRek);
        System.out.println("Total Valor Akumulasaun: "+totalAkum);
    }
}
