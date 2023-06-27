package org.example.arrayhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqencyK {
}




        /*Map<Integer, List<Integer>> map = new HashMap();
        List<Integer> solutionTemp = new ArrayList();
        int [] solution = new int[k];
        for(int i=0; i< nums.length; i++){
            if(map.get(nums[i])!=null) {
                List<Integer> temp = map.get(nums[i]);
                temp.add(nums[i]);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                map.put(nums[i], temp);
            }
        }
        for(List<Integer> temp : map.values().stream()
                .sorted((o1,o2)->o2.size()-o1.size())
                .toList()){
            solutionTemp.add(temp.get(0));
        }
        for(int i=0; i<k; i++){
            solution[i] = solutionTemp.get(i);
        }
        return solution;
    }*/
     /*   Map<Integer, List<Integer>> map = new HashMap();
        List<Integer> valueTemp = new ArrayList();
        int[] solution = new int[k];
        for (int i=0; i<nums.length; i++){
            if(map.get(nums[i])!=null){
                List<Integer> temp = map.get(nums[i]);
                temp.add(nums[i]);
            } else {
                List<Integer> temp = new ArrayList();
                temp.add(nums[i]);
                map.put(nums[i], temp);
            }
        }
        for(List<Integer> temp : map.values().stream()
                .sorted((o1, o2) -> o2.size()- o1.size())
                .toList()){
            valueTemp.add(temp.get(0));
        }
        solution = valueTemp.stream().mapToInt(Integer::intValue).limit(k).toArray();
        return solution;
    }*/

