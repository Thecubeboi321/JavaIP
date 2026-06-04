package reviusion_exam;

import java.util.Scanner;

public class rufect {
    public static void main(String[] args) {
        //vars
        String NRE, naran_estudante, dep;
        char sexu, rEstrutura;
        double vIPK, distance;
        boolean isEstrutura = false;
        int optionFloor = 0, optRoom = 0;
        
        Scanner scan = new Scanner(System.in);
        
        //outs
        System.out.println("Dijite NRE: ");
        NRE = scan.nextLine();
        System.out.println("Dijite Naran Estudante: ");
        naran_estudante = scan.nextLine();
        System.out.println("Dijite Departamento: ");
        dep = scan.nextLine();
        System.out.println("Sexu Estudante [M/F]: ");
        sexu = scan.next() .charAt(0);
        System.out.println("Dijite valor IPK Estudante: ");
        vIPK = scan.nextDouble();
        System.out.println("Dijite Distancia (Km): ");
        distance = scan.nextDouble();
        System.out.println("Tama Estrutura Nukelu/Senado? [S/N]: ");
        rEstrutura = scan.next() .charAt(0);
        
        if (rEstrutura == 'S') {
                isEstrutura = true;
            }
        
        if ((vIPK >= 3 && vIPK <= 4) || isEstrutura) {
            if (distance >= 10 || isEstrutura) {
                System.out.println("");
            System.out.println("Estudante nee bele asesu RUFECT");
            
                System.out.println("[1] Pizu 1");
                System.out.println("[2] Pizu 2");
                System.out.println("[3] Pizu 3");
                System.out.println("Eskolle Opsaun Pizu: ");
                optionFloor = scan.nextInt();
                
                switch (optionFloor) {
                    case 1:
                        if (isEstrutura) {
                            System.out.println("Hili ona floor 1 lil nigga");
                            System.out.println("=======================");
                            System.out.println("[1] Kuartu 1");
                            System.out.println("[2] Kuartu 2");
                            System.out.println("[3] Kuartu 3");
                            System.out.println("=======================");
                            optRoom = scan.nextInt();
                        } else {
                            System.out.println("Ita boot labele tama floor 1 lil nigga");
                        } break;
                    case 2:
                        if (sexu == 'M' || sexu == 'm') {
                            System.out.println("Hili ona floor 2 lil nigga");
                            System.out.println("=======================");
                            System.out.println("[1] Kuartu 1");
                            System.out.println("[2] Kuartu 2");
                            System.out.println("[3] Kuartu 3");
                            System.out.println("=======================");
                            optRoom = scan.nextInt();
                        } else {
                            System.out.println("Ita boot labele tama floor 2 lil nigga");
                        }
                        
                        break;
                    case 3:
                    if (sexu == 'F' || sexu == 'f') {
                            System.out.println("Hili ona floor 3 lil nigga");
                            System.out.println("=======================");
                            System.out.println("[1] Kuartu 1");
                            System.out.println("[2] Kuartu 2");
                            System.out.println("[3] Kuartu 3");
                            System.out.println("=======================");
                            optRoom = scan.nextInt();
                        } else {
                            System.out.println("Ita boot labele tama floor 3 lil nigga");
                        }                        
                        break;
                    default: System.out.println("favor hili nigga");
                }
                
            } else {
            System.out.println("Estudante nee labele bele tama rufect");
        }
        } else {
          System.out.println("Estudante nee labele tama rufect");
        }
        
        System.out.println("Recap");
        System.out.println("=================================================================");
        System.out.println("Naran           : "+naran_estudante);
        System.out.println("N.R.E.          : "+NRE);
        System.out.println("Departamento    : "+dep);
        System.out.println("Pizu            : "+optionFloor);
        System.out.println("Kuartu          : "+optRoom);
        System.out.println("=================================================================");
    }
}    
