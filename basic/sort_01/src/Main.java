import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N개의 자연수
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < arr.length; i++) {
            // 최소값 구하기
            int index = i; // 인덱스를 담아둘 임시 변수
            for(int j = i+1; j < arr.length; j++) {
                if(arr[index] > arr[j]) {
                    index = j;
                }
            }

            // SWAP
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            System.out.print(arr[i] + " ");
        }
    }
}