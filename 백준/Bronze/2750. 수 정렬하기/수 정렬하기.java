import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            arr = sort(arr);
            
            for(int x : arr) {
                System.out.println(x);
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    } // psvm
    
    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            
            int minIdx = i;
            
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        
        return arr;
    } // sort
} // class