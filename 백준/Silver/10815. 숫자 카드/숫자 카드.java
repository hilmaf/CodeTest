import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());// 상근이가 가진 카드 갯수
        
        HashMap<String, Integer> sgMap = new HashMap<>();// 상근이가 가진 카드
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            sgMap.put(st1.nextToken(), 0);
        }
        
        int M = Integer.parseInt(br.readLine());// 비교할 카드 갯수
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        while(st2.hasMoreTokens()) {
            if(sgMap.containsKey(st2.nextToken())) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    } //main
} // Main