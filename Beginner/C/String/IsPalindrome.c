bool isAlnum(char* s) {
    if ((*s >= 'A' && *s <= 'Z')
        || (*s >= 'a' && *s <= 'z')
        || (*s >= '0' && *s <= '9'))
        return true;
    return false;
}
bool isPalindrome(char* s) {
    char* p = s;
    int len = 0;
    while (*p != '\0') {
        if (isAlnum(p)) {
            len ++;
            if (*p >= 'A' && *p <= 'Z')
                *p = *p + 'a' - 'A';
        }
        p ++;
    }
    if (len <= 1)
        return true;
    
    //     method 1
    // char stack[len / 2];
    // for (int i = 0; i < len / 2; i ++) {
    //     while (!isAlnum(s))
    //         s ++;
    //     stack[i] = *(s ++);
    // }
    // while (!isAlnum(s))
    //     s ++;
    // if (len % 2 == 1)
    //     s ++;
    // for (int i = len / 2 - 1; i >= 0; i --) {
    //     while (!isAlnum(s))
    //         s ++;
    //     if (stack[i] != *(s ++))
    //         return false;
    // }
    // return true;
    
    //     method 2
    char array[len];
    for (int i = 0; i < len; i ++) {
        while (!isAlnum(s))
            s ++;
        array[i] = *(s ++);
    }
    for (int i = 0, j = len - 1; j > i; i ++, j --) {
        if (array[i] != array[j])
            return false;
    }
    return true;
}
