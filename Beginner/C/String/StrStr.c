int strStr(char* haystack, char* needle) {
    if (*needle == '\0')
        return 0;
    char* pn = needle;
    char* ph = haystack ++;
    int pos = 0;
    while (*pn != '\0' && *ph != '\0') {
        if (*ph == *pn) {
            ph ++; pn ++;
        }
        else {
            ph = haystack ++;
            pn = needle;
            pos ++;
        }
    }
    if (*ph == '\0' && *pn != '\0')
        return -1;
    return pos;
}
