import java.util.*;

public class Calculator {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a=obj.nextInt();
        System.out.println("Enter second number: ");
        double b= obj.nextInt();
        System.out.println("Choose the operator symbol: ");
        String operator=obj.next();
        switch (operator) {
            case "+": double sum= a+b;
            System.out.println("The sum is "+sum);
            break;
            case "-": double sub= a-b;
            System.out.println("The substraction is "+sub);
            break;
            case "*": double mul= a*b;
            System.out.println("The multiplication is "+mul);
            break;
            case "/": if (b==0){
                        System.out.println("Invalid division.");
                        } else{
                        double div= (a/b);
                        System.out.println("The division is "+div);
                        }
            break;
            case "%": if (b==0){
                        System.out.println("Invalid division.");
                        } else{
                        double mod= a%b;            
                        System.out.println("The modulus is "+mod);
                        }
            break;
            default: System.out.println("invalid");
            obj.close();
        }
    }

}
