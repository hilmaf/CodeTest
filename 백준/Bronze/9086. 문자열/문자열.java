import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            
            String result = String.valueOf(arr[0]) + String.valueOf(arr[arr.length-1]);
            System.out.println(result);
        }
    }
}