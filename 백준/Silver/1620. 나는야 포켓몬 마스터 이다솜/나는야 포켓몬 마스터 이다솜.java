import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 도감에 수록된 포켓몬의 개수
        int M = Integer.parseInt(st.nextToken()); // 내가 맞춰야 하는 문제의 개수
        
        Map<String, String> keyName = new HashMap<>();
        Map<String, String> keyNumber = new HashMap<>();
        for(int i = 1; i <= N; i++) {
            String input = br.readLine();
            keyName.put(input, String.valueOf(i));
            keyNumber.put(String.valueOf(i), input);
        }
        
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if(keyName.containsKey(str)) {
                System.out.println(keyName.get(str));
            } else if(keyNumber.containsKey(str)) {
                System.out.println(keyNumber.get(str));
            }
        }

        
    } // main
} // class