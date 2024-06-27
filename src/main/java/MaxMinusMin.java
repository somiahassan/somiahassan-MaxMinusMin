
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){ 
         // Initialize min and max with the first element of the list
        int min = nums.get(0);
        int max = nums.get(0);
        
        // Iterate through the list to find min and max values
        for (int num : nums) {
            if (num < min) {
                min = num; // Update min if current number is smaller
            }
            if (num > max) {
                max = num; // Update max if current number is larger
            }
        }
        
        // Return the difference between max and min
        return max - min;
    }
}
