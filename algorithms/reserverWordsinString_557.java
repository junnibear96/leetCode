package algorithms;
class Solution {
    public String reverseWords(String s) {
        String [] splitwords = s.split("");
        String flipanswer = "";
        
        for(int i = splitwords.length-1; i >= 0; i--){
            flipanswer = flipanswer + splitwords[i];
        }
        
        String [] splitflipwords = flipanswer.split(" ");
        String answer = "";
        
        for(int i = splitflipwords.length-1; i >= 0; i--){
            if(i != splitflipwords.length-1){
                answer = answer +" "+ splitflipwords[i];   
            }else{
                answer = answer + splitflipwords[i];   
            }
        }
        
        
        return answer;
    }
}