import java.util.Scanner;

public class Trabalu_ho_nextline_function {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                
        //inputs
        String naran1;
        int tinan;
        char sexu;
        double todan;
        double altura;
        
        //outputs
        System.out.println("++++++++Favor Priense ita nia Dadus++++++++");

        System.out.print("Priense Naran: ");
        naran1 = s.nextLine();
        
        System.out.print("Priense Tinan: ");
        tinan = s.nextInt();
        
        System.out.print("Sexu: ");
        sexu = s.next().charAt(0);   
        
        System.out.print("Priense Todan (KG): ");
        todan = s.nextDouble();
        
        System.out.print("Priense Altura (CM): ");
        altura = s.nextDouble();

        //Results
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("");
        System.out.println("Ita nia naran: "+naran1);
        System.out.println("Ita nia tinan: "+tinan+" Anos");
        System.out.println("Ita nia sexu: "+sexu);
        System.out.println("Ita nia todan: "+todan+" Kg");
        System.out.println("Ita nia altura: "+altura+" Cm");
    }
    
}
