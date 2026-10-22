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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        for(int i = 0; current!=null && i<left - 1; i++){
            prev = current;
            current=current.next;
        }
        ListNode newStart = prev;
        ListNode newEnd = current;
        prev = current;
        current = current.next;
        for(int i = 0; current!=null && i<right - left; i++){
            ListNode Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        if(newStart!=null){
        newStart.next = prev;}
        else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}