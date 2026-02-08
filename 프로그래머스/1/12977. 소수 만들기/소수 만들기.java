class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<nums.length-2;i++){
            sum = nums[i];
            for(int j=i+1;j<nums.length-1;j++){
                sum += nums[j];
                for(int k=j+1;k<nums.length;k++){
                    sum+=nums[k];
                    answer+=sosu(sum);
                    System.out.println(sum);
                    sum-=nums[k];
                }
                sum -= nums[j];
            }
        }
        return answer;
    }
    
    public int sosu(int n){
        int cnt = 0;
        
        for(int i=1;i<n;i++)
            if(n%i==0)
                cnt++;
        
        return (cnt > 1)?0:1;
    }
    
}