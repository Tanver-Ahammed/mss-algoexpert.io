package practise;


public class Test {

    public int jump(int[] nums) {
        if (nums.length == 1)
            return 0;
        int numberOfJump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0)
                break;
            if (nums[i] + i >= nums.length - 1) {
                ++numberOfJump;
                break;
            }
            i = findMaxIndex(nums, i, nums[i]) - 1;
            ++numberOfJump;
        }
        return numberOfJump;
    }

    private int findMaxIndex(int[] nums, int initialIndex, int currentJump) {
        int max = 0;
        int index = initialIndex;
        for (int i = initialIndex + 1; i <= initialIndex + currentJump; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new Test().jump(new int[]{2, 3, 1, 1, 4}));
//        System.out.println(new Test().jump(new int[]{2, 1}));
    }

}
