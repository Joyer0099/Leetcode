char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0)
        return "";
    if (strsSize == 1)
        return strs[0];
    for (int i = 0; i < strsSize; i ++) {
        if (strlen(strs[i]) == 0)
            return "";
    }
    int index = strlen(strs[0]);
    char* res = malloc(sizeof(char) * (++ index));
    for (int i = 0; i < index; i ++) {
        char comp = strs[0][i];
        for (int j = 1; j < strsSize; j ++) {
            if (strs[j][i] != comp || strs[j][i] == '\0') {
                res[i] = '\0';
                return res;
            }
        }
        res[i] = comp;
        if (i + 1 < index)
            res[i + 1] = '\0';
    }
    return res;
}
