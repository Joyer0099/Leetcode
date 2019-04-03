/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int cmp(const void *a , const void *b) {
    return *(int *)a > *(int *)b ? 1 : -1;
}

int* intersect(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    qsort(nums1, nums1Size, sizeof(int), cmp);
    qsort(nums2, nums2Size, sizeof(int), cmp);
    *returnSize = 0;
    int size = nums1Size < nums2Size? nums1Size: nums2Size;
    int pos1 = 0, pos2 = 0;
    int* res = malloc(sizeof(int) * size);
    while (pos1 < nums1Size && pos2 < nums2Size) {
        if (nums1[pos1] == nums2[pos2]) {
            res[(*returnSize) ++] = nums1[pos1 ++];
            pos2 ++;
        }
        else if (nums1[pos1] > nums2[pos2])
        pos2 ++;
        else
        pos1 ++;
    }
    return res;
}
