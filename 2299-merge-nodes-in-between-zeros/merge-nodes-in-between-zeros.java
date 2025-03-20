/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) 
    {
        if(head==null) return head;
        ListNode p1 = head;
        while (p1.next != null) {

            ListNode p2 = p1.next;
            int sum = 0;
            while (p2.val != 0) {
                sum = sum + p2.val;
                p2 = p2.next;
            }
            if(p2.next==null){
                p1.val=sum;
                p1.next=null;
            }
            else{
            p1.val = sum;
            p1.next = p2;
            p1 = p2;
            }
        }
        return head;
    }
}