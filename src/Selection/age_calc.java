package Selection;

import java.util.Scanner;

public class age_calc {
    public static void main(String[] args) {
 
        //Vars
        int birthyear, yearnow;
                
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your birthdate: ");
        birthyear = s.nextInt();
        System.out.print("Year now: ");
        yearnow = s.nextInt();
        
        //Calculations
        int calc = yearnow - birthyear;

        //Output
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Your age is: "+calc);
        
        if (calc >+ 17) {
            System.out.println("Youre old bruh get a j*b already");
        } else {
            System.out.println("Youre stil young bruh");
        }
    }
}
