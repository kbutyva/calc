public class Resulting {
    
    public void resulting(String s){
        String[] split = s.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);

        switch (split[1]) {
            case "+": System.out.println(a+b);
                
            break;
            case "-": System.out.println(a-b);
            break;
            case "*": System.out.println(a*b);
            break;
            case "/": System.out.println(a/b);
            break;
               
        }
        
    }
}
