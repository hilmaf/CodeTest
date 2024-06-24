import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String apocalypticNumber = "666";
        int cntN = 0;
        int title = 0;
        
        while(cntN < N) {
            ++title;
            String title_ = String.valueOf(title);
            
            if(title_.contains(apocalypticNumber)) cntN++;
        }
        
        System.out.println(title);
        
    }
}