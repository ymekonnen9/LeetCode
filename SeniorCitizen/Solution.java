package LeetCode.SeniorCitizen;

import java.util.ArrayList;

class Solution {
    public int countSeniors(String[] details) {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        for(String detail : details){
            ages.add(Integer.parseInt(detail.substring(11,12)));
        }
        int count =0;
        for(int i =0; i<ages.size(); i++){
            if(ages.get(i)>60){
                count ++;
            }
        }
        return count;
    }
}