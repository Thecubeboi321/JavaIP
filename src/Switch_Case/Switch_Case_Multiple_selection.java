package Switch_Case;


import java.util.Scanner;

public class Switch_Case_Multiple_selection {
    public static void main(String[] args) {
        //Variables
        int loron, fulan;
        
        //System.out.print("Enter a month number 1-12: ");
        System.out.print("Digite Numeru Fulan: ");
        
        Scanner s = new Scanner(System.in);
        fulan = s.nextInt();
        
        switch (fulan) { // agrupamento fulan ho loron 31
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:   
            case 12:
                loron = 31;
                System.out.println("Loron Hamutuk: "+loron);
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:    
                loron = 30;
                System.out.println("Loron hamutuk: "+loron);
                break;
            default:
                //System.out.println("This "+fulan+" is not the correct month number!! You stoobid ahh mf :b That clearly said 1 to 12 didn't it?");
                System.out.println("Numeu Fulan "+fulan+" ne'e Invalidu !"); 
        }
    }
}
