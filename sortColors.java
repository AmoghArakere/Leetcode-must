class Solution {
    
    public void sortColors(int[] nums) {
    int n = nums.length;
    int i = 0; // denotes for 0
    int j = 0; // denotes for 1
    int k = n - 1; // denotes for 2

    while (j <= k) {
        if (nums[j] == 0) {
            swap(nums, i, j);
            i++;
            j++;
        } else if (nums[j] == 2) {
            swap(nums, j, k);
            k--;
        } else {
            j++;
        }
    }
}

private void swap(int[] nums, int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}   
    }
