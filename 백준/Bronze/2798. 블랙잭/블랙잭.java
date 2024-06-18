import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        
        System.out.println(sumNumbers(arr, M));
    } // main
    
    public static int sumNumbers(int[] arr, int M) {
        int minAbs = Integer.MAX_VALUE;
        int result = 0;
        
        for(int i = 0; i < arr.length-2; i++) {
            for(int j = i+1; j < arr.length-1; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    int tempSum = arr[i] + arr[j] + arr[k];
                    
                    if(tempSum > M) continue;
                    
                    int temp = Math.abs(M - tempSum);
                    if(temp == 0) return tempSum;
                    
                    if(temp < minAbs) {
                        minAbs = temp;
                        result = tempSum;
                    }
                }
            }
        }
        
        return result;
    } // sumNumbers
} // Main