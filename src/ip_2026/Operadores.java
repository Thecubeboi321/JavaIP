package ip_2026;


public class Operadores {

    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int v = 6;
        int b = 7;

        int num1 = 3;
        int num2 = 3;

        int somatorio = num1 + num2;
        int somatoriomenus = b - v;
        int somatoriomulti = y * b;
        int somatoriodivi = v / x;

        System.out.println("Resultadu Addisaun: " + somatorio);
        System.out.println("Resultadu Menus: " + somatoriomenus);
        System.out.println("Resultadu Multiplikasaun: " + somatoriomulti);
        System.out.println("Resultadu Divisaun: " + somatoriodivi);
        System.out.println("Resultadu Elevadu: " + Math.pow(num1, num2));

        System.out.println("Valor husi: " + num1 + " + " + num2 + " = " +somatorio);
        System.out.println("Valor husi: " +y+ " x " + b + " = " +somatoriomulti);
        System.out.println("Valor husi: " +v+ " / " + x + " = " +somatoriodivi);
    }
}
