import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        
        for(char i = 'a'; i <= 'z'; i++) {
            boolean exists = false;
            for(int j = 0; j < arr.length; j++) {
                if(i == arr[j]) {
                    exists = true;
                    System.out.print(j + " ");
                    break;
                }
            }
            
            if(exists == false) {
                System.out.print(-1 + " ");
            }
        }
        
    } // psvm
} // Main