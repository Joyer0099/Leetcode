char* countAndSay(int n) {
    char* buf = malloc(sizeof(char) * 4500);
    char helper[4500];
    buf[0] = '1'; buf[1] = '\0';
    int size = 1;
    for (int i = 1; i < n; i ++) {
        int pos = 0;
        for (int j = 0; j < size; j ++) {
            int count = 1;
            while (buf[j] == buf[j + 1]) {
                count ++; j ++;
            }
            helper[pos ++] = (count ++) + '0';
            helper[pos ++] = buf[j];
        }
        size = pos;
        for (int k = 0; k < size; k ++)
            buf[k] = helper[k];
        buf[size] = '\0';
    }
    return buf;
}
