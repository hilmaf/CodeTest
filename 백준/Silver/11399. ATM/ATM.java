import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arr = quickSort(0, N-1, arr);

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <= i; j++) {
                sum += arr[j];
            }
        }

        System.out.println(sum);
    }

    public static int[] quickSort(int lt, int rt, int[] arr) {
        if(lt >= rt) return arr;

        int pivot = arr[lt];

        int i = lt+1;
        int j = rt;

        while(i <= j) {
            while(i <= rt && arr[i] <= pivot) { i++; }
            while(j > lt && arr[j] >= pivot) { j--; }

            if(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[lt];
        arr[lt] = arr[j];
        arr[j] = temp;

        quickSort(lt, j - 1, arr);
        quickSort(j + 1, rt, arr);

        return arr;
    }
}