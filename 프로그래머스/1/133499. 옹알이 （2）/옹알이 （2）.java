class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            StringBuilder temp = new StringBuilder();
            int j=0;
            String prior = "";
            while(j<babbling[i].length()){
                String two = (j<babbling[i].length()-1)?babbling[i].substring(j,j+2):"";
                String three = (j<babbling[i].length()-2)?babbling[i].substring(j,j+3):"";
                if(three.equals("aya") && !prior.equals("aya")){
                    j+=3;  
                    prior = "aya";
                }
                else if(three.equals("woo") && !prior.equals("woo")){
                    j+=3;
                    prior = "woo";
                }
                else if(two.equals("ma") && !prior.equals("ma")){
                    j+=2;
                    prior = "ma";
                }
                else if(two.equals("ye") && !prior.equals("ye")){
                    j+=2;
                    prior = "ye";
                }
                else{
                    temp.append(babbling[i].charAt(j));
                    prior = "";
                    j++;
                }
            }
            answer += (temp.toString().equals(""))?1:0;
        }
        
        return answer;
    }
}