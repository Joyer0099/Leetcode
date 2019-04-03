int myAtoi(char* str) {
    long long res = 0;
    int tag = 1;
    while (*str == ' ')
        str ++;
    if ((*str < '0' || *str > '9') && *str != '-' && *str != '+')
        return 0;
    if (*str == '-') {
        tag = -1; str ++;
    }
    else if (*str == '+')
        str ++;
    int count = 0;
    while (*str == '0')
        str ++;
    while (*str != '\0' && *str >= '0' && *str <= '9') {
        count ++;
        if (count > 10) {
            if (tag < 0)
                return INT_MIN;
            return INT_MAX;
        }
        res = *str - '0' + res * 10;
        str ++;
    }
    res *= tag;
    if (res < INT_MIN)
        return INT_MIN;
    if (res > INT_MAX)
        return INT_MAX;
    return res;
}
