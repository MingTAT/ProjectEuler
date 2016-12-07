package easy;

import java.util.Arrays;

public class Move0s {
	public static void main(String[] args){
		int[] a = {1,2,3,0,0,2,13};
		System.out.println(Arrays.toString(moveZeroes(a)));
	}
	
    public static int[] moveZeroes(int[] nums) {
        int NextNonZero = 1;
		int index = 0;

        while(index < nums.length && NextNonZero < nums.length){
            if(nums[index] == 0){
                if(nums[NextNonZero] != 0){
                    exchange(nums, index++, NextNonZero++);
                }else NextNonZero ++;
            }else{
                index ++;
                NextNonZero ++;
            }
        }
        return nums;
        
    }
    
    public static void exchange(int[] array, int i, int j){
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
	
}
