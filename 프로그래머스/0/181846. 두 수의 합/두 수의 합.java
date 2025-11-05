import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger Big_a = new BigInteger(a);
        BigInteger Big_b = new BigInteger(b);
        return (Big_a.add(Big_b).toString());
    }
}