class Solution {
    public int solution(String[] order) {
        int times = 0;
        for(int i=0; i<order.length;i++){
            if(order[i].contains("americano") || order[i].equals("anything"))
                times++;
        }
        return 5000*(order.length - times) + 4500*times;
    }
}