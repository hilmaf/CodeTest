import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2번. 공통원소 구하기
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

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //////////////////////////////////////////////////////////////////

        ArrayList<Integer> answer = new ArrayList<Integer>();
        int pnt1 = 0, pnt2 = 0;

        while(pnt1 < arr1.length && pnt2 < arr2.length) {
            if(arr1[pnt1] == arr2[pnt2]) {
                answer.add(arr1[pnt1]);
                pnt1++;
                pnt2++;
            } else if(arr1[pnt1] < arr2[pnt2]) {
                pnt1++;
            } else {
                pnt2++;
            }
        }


        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}