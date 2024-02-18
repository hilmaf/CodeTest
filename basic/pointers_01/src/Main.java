import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1번. 두 배열 합치기
        Scanner sc = new Scanner(System.in);
        int arr1Length = Integer.parseInt(sc.next());
        Integer[] arr1 = new Integer[arr1Length];
        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = Integer.parseInt(sc.next());
        }

        int arr2Length = Integer.parseInt(sc.next());
        Integer[] arr2 = new Integer[arr2Length];
        for (int i = 0; i < arr2Length; i++) {
            arr2[i] = Integer.parseInt(sc.next());
        }

        int catLength = arr1Length + arr2Length;
        int[] catArr = Stream
                .concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.sort(catArr);

        for (int i = 0; i < catLength; i++) {
            System.out.print(catArr[i] + " ");
        }

    }
}