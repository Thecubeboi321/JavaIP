package Conversion;

public class Conversion_tipu {
    public static void main(String[] args) {
        
    //int ==>
    int a = 30;
    double b = a;  
    
    //double ==> int
    double x= 1738;
    int y = (int)x;

    //String ==> integer
    String num1_string = "17";
    String num2_string = "38";
    int dat1_int = Integer.parseInt(num1_string);
    int dat2_int = Integer.parseInt(num2_string);
    
    int calculation = dat1_int + dat2_int;
    
    //Conversion from int to string
    int num = 21;
    String str = String.valueOf(num);
    
    //Output 
        System.out.println("No conversions(straight from a): "+a);
        System.out.println("Conversion from int to double: "+b);
        System.out.println("Conversion from double to int: "+y);
        System.out.println(dat1_int);
        System.out.println("Calculation between converted strings("+dat1_int+"+"+dat2_int+") = "+calculation);
        // System.out.println((((Integer)dat1_int)).getClass().getSimpleName());
        System.out.println("Conversion from String to integer: "+b);
        
    //Condition output
        if (str instanceof String) {
            System.out.println("This Variable is a String Nigga :b");
            
        }
    }   
}
