import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1번. 두 배열 합치기
        Scanner sc = new Scanner(System.in);
        int arr1Length = Integer.parseInt(sc.next());
        int[] arr1 = new int[arr1Length];
        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = Integer.parseInt(sc.next());
        }

        int arr2Length = Integer.parseInt(sc.next());
        int[] arr2 = new int[arr2Length];
        for (int i = 0; i < arr2Length; i++) {
            arr2[i] = Integer.parseInt(sc.next());
        }

        int pnt1 = 0, pnt2 = 0;
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        while(pnt1<arr1Length && pnt2<arr2Length) {
            if(arr1[pnt1] <= arr2[pnt2]) {
                answerList.add(arr1[pnt1++]);
            } else {
                answerList.add(arr2[pnt2++]);
            }
        }

        while(pnt1<arr1Length) {
            answerList.add(arr1[pnt1++]);
        }

        while(pnt2<arr2Length) {
            answerList.add(arr2[pnt2++]);
        }

        for(int x : answerList) {
            System.out.print(x + " ");
        }
    }
}