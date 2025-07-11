import java.util.Scanner;
public class Problem_1{

    public static double calculate(double a, double b, String op){
        double result = 0.0;
        switch(op.toLowerCase()){
            case "add": {
                result = a+b;
                break;
            }
            case "subtract": {
                result = a-b;
                break;
            }
            case "multiply": {
                result = a*b;
                break;
            }
            case "divide": {
                result = a/b;
                break;
            }
            default:{
                throw new IllegalArgumentException("Invalid operator");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        String op = s.next();
        System.out.println(calculate(a,b,op));
        s.close();
    }
}