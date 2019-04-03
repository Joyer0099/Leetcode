/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* pd = head;
    if (n == 1) {
        if (head->next == NULL)
            return NULL;
        while (pd->next->next)
            pd = pd->next;
        pd->next = NULL;
    }
    else {
        struct ListNode* pl = head;
        for (int i = 0; i < n; i ++)
            pl = pl->next;
        if (pl == NULL)
            return pd->next;
        while (pl->next) {
            pl = pl->next;
            pd = pd->next;
        }
        pd->next = pd->next->next;
    }
    return head;
}
