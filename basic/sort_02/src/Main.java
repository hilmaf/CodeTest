import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 입력 받기
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt(); // N개의 자연수
        int[] arr = new int[N];
        for(int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }

        /////////////////////////////////////

        for(int i = 0; i < N-1; i++) {
            for(int j = 0; j < N-i-1; j++) { // i 다음 수부터 for 돌면서 i와 비교
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } // for2
        } // for1


        // 출력하기
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    } // psvm
} // class