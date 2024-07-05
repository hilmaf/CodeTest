import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++) {
            String unheard = br.readLine();
            set.add(unheard);
        }

        List<String> list = new ArrayList<>();
        for(int i = 0; i < M; i++) {
            String unseen = br.readLine();
            if(set.contains(unseen)) {
                list.add(unseen);
            }
        }
        
        Collections.sort(list);
        
        System.out.println(list.size());
        for(String str : list) {
            System.out.println(str);
        }
    } // main
} // class