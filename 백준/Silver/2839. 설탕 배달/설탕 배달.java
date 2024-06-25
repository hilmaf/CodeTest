import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int result = 0;
        if(N%5 == 0) {
            result = N/5;
        } else {
          
            while(N>0) {
                N-=3;
                result+=1;
                
                if(N%5==0) {
                    result += N/5;
                    break;
                } else if(N==1 || N==2) {
                    result = -1;
                    break;
                } else if(N==0) {
                    break;
                }
            }
            
        }
        
        System.out.println(result);
    } //main
} //Main