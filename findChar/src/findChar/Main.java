package findChar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine().toLowerCase();
	    String charStr = sc.nextLine().toLowerCase();
	    
	    char ch = charStr.charAt(0);
	    char[] strArr = str.toCharArray();
	    
	    int answer = 0;
	    for(int i = 0; i<strArr.length; i++) {
	     	if(strArr[i]==ch) {
	        	answer++;
	        }
	    }
	    
	    System.out.println(answer);
	    
	    // toLowerCase(), toUpperCase()
	    // Scanner 통해서 char 변수 얻는 법
	    // String 과 char 비교할 때 String을 char배열로 바꾸는 법 toCharArray()
	}

}
