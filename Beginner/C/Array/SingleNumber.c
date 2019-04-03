int cmp(const void *a , const void *b) {
    return *(int *)a > *(int *)b ? 1 : -1;
}

int singleNumber(int* nums, int numsSize) {
    //     method 1
    // qsort(nums, numsSize, sizeof(int), cmp);
    // for (int i = 0; i < numsSize - 1; i ++) {
    //     if (nums[i] == nums[i + 1])
    //         i ++;
    //     else
    //         return nums[i];
    // }
    // return nums[numsSize - 1];
    
    //     method 2
    int res = nums[0];
    for (int i = 1; i < numsSize; i ++)
        res ^= nums[i];
    return res;
}
