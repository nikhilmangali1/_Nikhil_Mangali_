import java.util.Scanner;
public class Problem_2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=0;i<a;i++){
            System.out.print(2*i+1+" ");
        }
        s.close();
    }
}