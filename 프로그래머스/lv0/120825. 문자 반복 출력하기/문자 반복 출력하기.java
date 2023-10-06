class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            for(int j=0; j<n; j++) {
                String s = my_string.substring(i, i+1);
                answer += s;    
            }
        }
        return answer;
    }
}