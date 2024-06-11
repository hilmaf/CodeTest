import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < N; i++) {
            sum += Character.getNumericValue(arr[i]);
        }


        System.out.println(sum);

    }
}
