
import java.util.Arrays;

/**
 * Cycle Sort:
 * Used when numbers are in the range 1 to n
 * and there are no duplicates.
 */
public class CycleSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};

        System.out.println(Arrays.toString(nums));
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void cycleSort(int[] nums) {
        int st = 0;

        while (st < nums.length) {
            int correct = nums[st] - 1;

            if (nums[st] != nums[correct]) {
                int temp = nums[st];
                nums[st] = nums[correct];
                nums[correct] = temp;
            } else {
                st++;
            }
        }
    }
}

/*
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1)
 */
