int firstUniqChar(char* s) {
    int count[26];
    char* p = s;
    for(int i = 0; i < 26; i ++)
        count[i] = 0;
    while(*p != 0 && p) {
        count[((int)*p) - 97] ++;
        p ++;
    }
    int pos = 0;
    while(*s != 0 && s) {
        if(count[((int)*s) - 97] == 1)
            return pos;
        pos ++;
        s ++;
    }
    return -1;
}
