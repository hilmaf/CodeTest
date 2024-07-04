import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 상근 숫자 카드 개수
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st1.nextToken());
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine()); // 비교 숫자 카드 개수
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            
            if(map.get(num) == null) sb.append(0).append(" ");
            else sb.append(map.get(num)).append(" ");
        }
        
        System.out.println(sb.toString());
        
    } // main
} // class