import java.util.Scanner;

public class Calculator {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Validator v = new Validator();
        Resulting r = new Resulting();
		System.out.println("Input: ");
        String s = sc.nextLine();
        
        if (v.validate(s)) {
            System.out.println("Output: ");
           r.resulting(s);
                       
        } else {
            System.out.println("format matematicheskoy operacii ne udovletvoryaet zadaniyu - "
                    + "dva operanda (chisla ot 1 do 10) i odin operator (+, -, /, *)");
        }
        
    }
    
}
