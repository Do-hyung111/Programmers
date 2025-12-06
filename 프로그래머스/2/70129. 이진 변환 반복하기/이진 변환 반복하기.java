class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int sum = 0;
        String Binary = s;
        int count = 0;
        
        while(!Binary.equals("1")){
            int temp = deleteZero(Binary);
            sum += temp;
            Binary = convertBinary(Binary.length() - temp);
            count++;
        }
        answer[0]=count;
        answer[1]=sum;
        return answer;
    }
    
    //제거할 0의 개수
    public int deleteZero(String s){
        int size = 0;
        for(char c : s.toCharArray()){
            if(c == '0')
                size++;
        }
        return size;
    } 
    //이진 변환 결과
    public String convertBinary(int size){
        StringBuilder sb = new StringBuilder();
        
        while(size != 0){
            sb.insert(0, size%2);
            size = size/2;
        }
        
        return sb.toString();
    }
    
    
}