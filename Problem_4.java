import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int[] list = new int[n];
        for(int i=0;i<n;i++){
            list[i] = s.nextInt();
        }
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=1;i<=9;i++){
            map.put(i,0);
        }
        for(int item:list){
            for(int i=1;i<=9;i++){
                if(item%i==0){
                    map.put(i,map.get(i)+1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+":"+e.getValue()+"   ");
        }
        s.close();
    }
}
