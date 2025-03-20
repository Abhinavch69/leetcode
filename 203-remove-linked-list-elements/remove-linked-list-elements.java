/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
    // Remove leading nodes with value 'val'
    while (head != null && head.val == val) {
        head = head.next;
    }

    // If the list is empty after removing leading nodes
    if (head == null) return null;

    ListNode prev = head;
    ListNode temp = head.next;

    while (temp != null) {
        if (temp.val == val) {
            prev.next = temp.next; // Remove the node
        } else {
            prev = temp; // Move prev only when temp is not removed
        }
        temp = temp.next; // Always move temp
    }

    return head;
}

}