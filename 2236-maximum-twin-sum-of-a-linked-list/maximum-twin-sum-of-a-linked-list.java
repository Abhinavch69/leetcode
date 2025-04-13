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
    public int pairSum(ListNode head) {
        if(head==null || head.next==null) return 0;
        ListNode mid = middleNode(head);
        ListNode revMid=reverseList(mid);
        return helper(head,revMid);
    }

    public int helper(ListNode first,ListNode second){
        int max=0;
        while(first!=null && second!=null){
            int sum=first.val+second.val;
            max=Math.max(max,sum);
            first=first.next;
            second=second.next;
        }
        return max;
    }

    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}