import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // 입력 받기
        int N = sc.nextInt(); // N개의 숫자
        int[] arr = new int[N];

        for(int i = 0 ; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        ////////////////////////////////////

        for(int i = 1; i < N; i++) {
            int index = i; // 인덱스 임시저장
            for(int j = i-1; j >= 0; j--) {
                if(arr[j] > arr[index]) {
                    int temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                }

                index--;
            }
        }

        // 출력하기
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }// psvm
}// class