import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        
        Set<String> set = new HashSet<>();
        char[] sArr = S.toCharArray();
        
        int lt = 0;
        int rt = 0;
        
        while(lt < sArr.length) {
            StringBuilder sb = new StringBuilder();
            if(rt >= sArr.length) {
                lt++; 
                rt = lt;
                if(lt == sArr.length) break;
            }
            
            for(int i = lt; i <= rt; i++) {
                sb.append(sArr[i]);
            }
            
            set.add(sb.toString());
            rt++;
        }
        
        System.out.println(set.size());
    }
}