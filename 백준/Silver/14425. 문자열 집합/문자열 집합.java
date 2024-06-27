import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken()); // 집합 S 문자열 개수
        int M = Integer.parseInt(st1.nextToken()); // 비교 문자열 개수
        
        Map<String, Integer> SMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            SMap.put(br.readLine(), 0);
        }
        
        int result = 0;
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            
            if(SMap.containsKey(str)) result++;
        }
        
        System.out.println(result);
    }
}