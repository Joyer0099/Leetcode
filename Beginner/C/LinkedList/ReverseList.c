/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if (head == NULL || head->next == NULL)
        return head;
    struct ListNode* p = head->next;
    head->next = NULL;
    while (p) {
        struct ListNode* temp = p;
        p = p->next;
        temp->next = head;
        head = temp;
    }
    return head;
}
