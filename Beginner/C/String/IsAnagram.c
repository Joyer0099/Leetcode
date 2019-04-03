bool isAnagram(char* s, char* t) {
    int cs[26];
    int ct[26];
    for(int i = 0; i < 26; i ++) {
        cs[i] = 0; ct[i] = 0;
    }
    while(s && t && *s != 0 && *t != 0) {
        cs[((int)*s) - 97] ++;
        ct[((int)*t) - 97] ++;
        s ++; t ++;
    }
    if (*s != 0 || *t != 0)
        return false;
    for(int i = 0; i < 26; i ++) {
        if (cs[i] != ct[i])
            return false;
    }
    return true;
}
