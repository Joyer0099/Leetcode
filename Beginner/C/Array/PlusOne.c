/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize) {
    int carry = 1;
    *returnSize = digitsSize;
    for (int i = digitsSize - 1; i >= 0; i --) {
        if (carry == 1) {
            if (digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i] ++;
                carry = 0;
            }
        }
        else
            break;
    }
    int pos = 0;
    int* res = malloc(sizeof(int) * (digitsSize + 1));
    if (carry == 1) {
        (*returnSize) ++;
        res[0] = 1;
        pos ++;
    }
    for (int i = 0; pos < (*returnSize); pos ++, i ++) {
        res[pos] = digits[i];
    }
    return res;
}
