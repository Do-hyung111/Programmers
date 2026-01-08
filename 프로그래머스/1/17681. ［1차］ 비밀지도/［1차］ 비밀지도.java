class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            String one = String.format("%"+arr1.length+"s", Integer.toBinaryString(arr1[i])).replace(' ','0');
            String two = String.format("%"+arr2.length+"s", Integer.toBinaryString(arr2[i])).replace(' ','0');
            
            StringBuilder sb = new StringBuilder();
            for(int j=0; j < one.length();j++){
                char temp1 = one.charAt(j);
                char temp2 = two.charAt(j);
                
                if(temp1 == '0' && temp2 == '0')
                    sb.append('0');
                else
                    sb.append('1');
            }
            answer[i] = sb.toString().replace('1', '#').replace('0', ' ');
        }
        
        return answer;
    }
}