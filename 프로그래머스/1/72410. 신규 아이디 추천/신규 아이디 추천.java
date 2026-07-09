class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase(); //step1: 소문자
        new_id = new_id.replaceAll("[^a-z|\\d|\\-|\\.|\\_]",""); //step2: 문자정리
        new_id = new_id.replaceAll("[//.]{2,}", "."); //step3: 연속 점 정리
        new_id = new_id.replaceAll("^[\\.]|[\\.]$",""); //step4: 첫,마지막 글자 정리
        new_id = new_id.isEmpty() ? "a": new_id; //step5: 빈 문자열 처리
        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15); //step6: 크기 조절 
            new_id = new_id.replaceAll("[\\.]$","");
        }
        while(new_id.length() <= 2)
            new_id += new_id.charAt(new_id.length()-1); //step7: 크기 조절
        
        return new_id;
    }
}