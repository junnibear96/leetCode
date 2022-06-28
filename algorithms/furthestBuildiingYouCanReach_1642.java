package algorithms;

import java.util.PriorityQueue;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int building = 0; building < heights.length-1; building++){
            if(heights[building+1] > heights[building]){
                pq.add(heights[building+1] - heights[building]);    
            }
            if(pq.size() > ladders){
                bricks -= pq.poll();
            }
            if(bricks < 0){
                return building;
            }
        }
        return heights.length - 1;
        
        
        
        
        
        /*
        boolean status = true;
        while(status){
            if(answer < heights.length-1){
                if(heights[answer] >= heights[answer+1]){
                    ++answer;   
                }else{
                    int amount = heights[answer+1] - heights[answer];
                    boolean check = bricks >= amount ? true : false;
                    if(check && ladders <= 0){
                        bricks = bricks - amount;
                        System.out.println(answer+ "th turn left bricks : " + bricks);
                        ++answer;
                    }else if(ladders > 0){
                        --ladders;
                        System.out.println(answer+ "th turn left ladders : " + ladders);
                        ++answer;
                    }else{
                        status = false;
                    }                    
                }
            }else{
                return answer;
            }      
        }
        return answer;
        */
        }
        
}