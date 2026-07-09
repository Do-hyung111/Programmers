class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase(); //step1: 소문자
        new_id = new_id.replaceAll("[^a-z|\\d|\\-|\\.|\\_]",""); //step2: 문자정리
        new_id = new_id.replaceAll("[//.]{2,}", "."); //step3: 연속 점 정리
        new_id = deleteSpot(new_id); //step4: 첫,마지막 글자 정리
        if(new_id.equals(""))
            new_id = "a"; //step5: 빈 문자열 처리
        if(new_id.length() >= 16)
            new_id = deleteSpot(new_id.substring(0,15)); //step6: 크기 조절 
        while(new_id.length() <= 2)
            new_id += new_id.charAt(new_id.length()-1); //step7: 크기 조절
        
        return new_id;
    }
    
    public String deleteSpot(String str){
        if(str.length() > 0 && str.charAt(0) == '.')
            str = str.substring(1);
        if(str.length() > 0 && str.charAt(str.length()-1) == '.')
            str = str.substring(0,str.length()-1);
        return str;
    }
}