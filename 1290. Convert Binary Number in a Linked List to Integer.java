/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head != null)
        {
            sum = sum << 1 | head.val;
            head = head.next;
        }
        return sum;
    }
}