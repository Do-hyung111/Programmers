import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums)
            s.add(i);
        
        return (s.size() < nums.length/2)?s.size():nums.length/2;
    }
}