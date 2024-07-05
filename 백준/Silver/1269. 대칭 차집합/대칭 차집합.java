import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st1.nextToken());
        int bSize = Integer.parseInt(st1. nextToken());
        
        // 집합 A 원소 채우기
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Set<Integer> aSet = new HashSet<>();
        for(int i = 0; i < aSize; i++) {
            Integer x = Integer.parseInt(st2.nextToken());
            aSet.add(x);
        }
        
        // 집합 B 원소 채우기 + B 교집합에 해당하는 원소 value값 변경
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        Set<Integer> bSet = new HashSet<>();
        for(int i = 0; i < bSize; i++) {
            Integer x = Integer.parseInt(st3.nextToken());
            if(aSet.contains(x)) aSet.remove(x);
            else bSet.add(x);
        }
        
        System.out.println(aSet.size() + bSet.size());
        
    }
}