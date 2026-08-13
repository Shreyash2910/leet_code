/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        int target=0;
        ListNode slow = head;
        ListNode fast= head;
        list.add(slow);
        while (fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(list.contains(slow)){
                return slow;
            }
            list.add(slow);
        }
        return null;
    }
}