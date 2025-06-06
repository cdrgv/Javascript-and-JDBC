public class LinearSearch {
    public static int Linear_Search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
               target= i;

        }
        return target;
    }
    public static void main(String args[]) {
        int nums[] = { 5, 7, 9, 11, 13 };
        int target = 11;
        int result = Linear_Search(nums, target);
        if (result != -1) {
            System.out.println("Element Found at " + result);
        } else {
            System.out.println("Element Not Found");
        }
    }
}
