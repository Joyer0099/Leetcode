void moveZeroes(int* nums, int numsSize) {
    int p = -1, count = 0;
    for (int i = 0; i < numsSize; i ++) {
        if (nums[i] == 0) {
            count ++;
            if (p == -1)
                p = i;
        }
        else if (nums[i] != 0 && p != -1) {
            nums[p] = nums[i];
            p ++;
        }
    }
    for (int i = numsSize - 1; i >= numsSize - count; i --) {
        nums[i] = 0;
    }
}
