package Selection;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        int idade;
    
        Scanner scan = new Scanner(System.in);
            System.out.println("Dijita ita nia idade: ");
            idade = scan.nextInt();
            System.out.println("Ita boot nia idade: "+idade+" anos");

            if ((idade >= 0) && (idade <= 5)) { //idade < 6
                System.out.println("Gratituito");
            } else if ((idade >= 6) && (idade <= 12)){ //Idade <= 12
                System.out.println("Billete labarik nian");
            } else if ((idade >= 13) && (idade <= 65)){ //Idade <= 65
                System.out.println("Billete Normal");    
            } else {
                System.out.println("3a Idade (Idoso)"); // Idade > 65
            }
    }        
}
