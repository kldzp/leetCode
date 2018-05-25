package Leet;

import java.util.HashMap;
import java.util.Map;

public class leet1{

    public static void main(String[] args) {
        leet1 leet = new leet1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = leet.twoSum(nums, target);
        System.out.println(result[0]+" and "+result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int size = nums.length;
        for(int i=0;i<size;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<size;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp))
            {
                //return result={i,map.get(temp)};
                return new int[] { i, map.get(temp) };
            }
        }
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        */
        
        /*
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(nums[i]+nums[j]==target)
                    return result={nums[i],nums[j]};
            }
        }
        */
        return new int[] { 0, 0 };
    }
}