import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //////////////////////////////////////////////

        int answer = 0;
        int pnt1 = 0;
        int cnt = 0;

        for (int pnt2 = 0; pnt2 < N; pnt2++) {
            if(arr[pnt2] == 0) {cnt++;}

            while(cnt > k) {
                if(arr[pnt1] == 0) {cnt--;}
                pnt1++;
            }

            answer = Math.max(answer, pnt2-pnt1+1);

//            if( cnt <= k ) {
//
//                if(arr[pnt2]==0) {
//                    length = pnt2 - pnt1 + 1;
//                    cnt++;
//                }
//
//                if(length > answer) {
//                    answer = length;
//                }
//
//            } else {
//
//                while(arr[pnt1] != 0) {
//                    pnt1++;
//                }
//
//                cnt--;
//                length = pnt2 - pnt1 + 1;
//
//                if(length > answer) {
//                    answer = length;
//                }
//            }
        }


        System.out.println(answer);

    }
}