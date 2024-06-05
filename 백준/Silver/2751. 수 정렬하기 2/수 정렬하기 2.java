import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 배열 생성
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(Integer x : list) {
            sb.append(x).append("\n");
        }
        
        System.out.println(sb.toString());
    } // psvm
    
} // class