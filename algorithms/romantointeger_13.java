package algorithms;
class Solution {
    public int romanToInt(String s) {
        int value = 0;
        String[] split = s.split("");
        for(int len = 0; len < split.length; len++){
            if(s.charAt(len) == 'I'){
                if (len != split.length -1){
                    if(s.charAt(len+1) == 'V'){
                        value += 4;
                        len++;
                    }else if(s.charAt(len+1) == 'X'){
                        value += 9;
                        len++;
                    }else{
                        value += 1;
                    }
                }else{
                    value += 1;
                }
            }else if(s.charAt(len) == 'V'){
                value += 5;
            }else if(s.charAt(len) == 'X'){
                if (len != split.length -1){
                    if(s.charAt(len+1) == 'L'){
                        value += 40;
                        len++;
                    }else if(s.charAt(len+1) == 'C'){
                        value += 90;
                        len++;
                    }else{
                        value += 10;
                    }
                }else{
                    value += 10;
                }
            }else if(s.charAt(len) == 'L'){
                value += 50;
            }else if(s.charAt(len) == 'C'){
                if (len != split.length -1){
                    if(s.charAt(len+1) == 'D'){
                        value += 400;
                        len++;
                    }else if(s.charAt(len+1) == 'M'){
                        value += 900;
                        len++;
                    }else{
                        value += 100;
                    }
                }else{
                    value += 100;
                }
            }else if(s.charAt(len) == 'D'){
                value += 500;
            }else{
                value += 1000;
            }
        }
        return value;
    }
}