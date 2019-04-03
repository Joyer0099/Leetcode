int removeDuplicates(int* nums, int numsSize) {
    if (numsSize == 0) {
        return 0;
    }
    int pos = 1;
    for (int i = 1; i < numsSize; i ++) {
        if (nums[i - 1] != nums[i])
        nums[pos ++] = nums[i];
    }
    return pos;
}
