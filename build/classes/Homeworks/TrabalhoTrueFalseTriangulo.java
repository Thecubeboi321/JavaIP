public class TrabalhoTrueFalseTriangulo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double L1, L2, L3;
        boolean EQ, ES, TRI;
        
        System.out.print("First Side :");
        L1 = input.nextDouble();
        
        System.out.print("Second Side :");
        L2 = input.nextDouble();
        
        System.out.print("Third Side :");
        L3 = input.nextDouble();
        
        TRI = (L1 < L2 + L3) && (L2 < L1 + L3) && (L3 < L1 + L2 );
        EQ = (L1 == L2) && (L2 == L3);
        ES = (L1 != L2) && (L2 != L3) && (L1 !=L3);
        
        
        System.out.println("<==========================>");
        System.out.println("Triangle?" + TRI);
        System.out.println("Equilateral? " + EQ);
        System.out.println("? " + ES);
    }
    
}
