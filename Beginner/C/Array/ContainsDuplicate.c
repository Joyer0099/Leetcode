int cmp(const void *a , const void *b) {
    return *(int *)a > *(int *)b ? 1 : -1;
}

bool containsDuplicate(int* nums, int numsSize) {
    // Sort
    qsort(nums, numsSize, sizeof(int), cmp);
    
    // Loop
    for (int i = 0; i < numsSize - 1; i ++) {
        if (nums[i] == nums[i+1])
        return true;
    }
    
    return false;
}
