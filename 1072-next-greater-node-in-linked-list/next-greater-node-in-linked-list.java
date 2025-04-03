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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp.next!=null){
            ListNode next=temp.next;
            while(next!=null){
                if(next.val>temp.val){
                    list.add(next.val);
                    break;
                }
                next=next.next;
                if(next==null){
                    list.add(0);
                }
            }
            temp=temp.next;
        }
        list.add(0);
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}