void rotate(int* nums, int numsSize, int k) {
    k = k % numsSize;
    while (k > 0 && numsSize) {
        int temp = nums[numsSize - 1];
        for(int i = numsSize - 1; i > 0; i --) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
        k --;
    }
}
