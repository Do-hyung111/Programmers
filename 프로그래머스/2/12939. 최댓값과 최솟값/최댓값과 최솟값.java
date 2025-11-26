class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] div = s.split(" ");
        int[] temp = new int[div.length];
        int max = Integer.parseInt(div[0]);
        int min = Integer.parseInt(div[0]);
        for(int i=1; i<temp.length;i++){
            int num = Integer.parseInt(div[i]);
            max = (max<num) ? num : max;
            min = (min>num) ? num : min;
        }
        return min + " " + max;
    }
}