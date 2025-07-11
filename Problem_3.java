import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = (a%2==0)? a-1:a;
        for(int i=0;i<count;i++){
            System.out.print(2*i+1+" ");
        }
       s.close();
    }
}
