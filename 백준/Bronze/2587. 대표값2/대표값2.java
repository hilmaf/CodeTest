import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);

        System.out.println(getAverage(arr));
        System.out.println(getMiddleValue(arr));

    } // psvm

    public static int getAverage(int[] arr) {
        int sum = 0;

        for(int x : arr) {
            sum += x;
        }

        return sum/arr.length;
    } // getAverage

    public static int getMiddleValue(int[] arr) {

        return arr[2];
    } // getMiddleValue

    
} // Main