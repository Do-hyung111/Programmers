import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int idx = numbers.length-1;
        Arrays.sort(numbers);
        return numbers[idx] * numbers[idx-1];
    }
}