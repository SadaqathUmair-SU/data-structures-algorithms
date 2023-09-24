//Solution:
// The goal of this problem is to reorder a singly linked list in a specific way. The solution approach involves three main steps:

// Find the middle of the linked list using two pointers, one slow and one fast. This allows us to divide the list into two halves.

// Reverse the second half of the list. This step involves reversing the direction of the links between nodes in the second half, effectively turning it around.

// Merge the two halves back together in a specific order. Starting with the first half, we alternately pick nodes from each half and connect them to create the reordered linked list.

// By following these steps, we can efficiently reorder the linked list as required.

class ListNode{

  ListNode next;
  int val;

  public ListNode(ListNode next, int val){
    this.next = next;
    this.val = val;
  }
  
}
class Solution{

public void reorderList(ListNode head){

  ListNode slow = head;
  ListNode fast = head;

  while(fast.next != null && fast.next.next != null){

    slow = slow.next;
    fast = fast.next.next;
  }

  ListNode rev = reverse(slow);

  while(head != null && rev != null){
  ListNode l1 = head.next;
    ListNode l2 = rev.next;

    head.next = rev;
    rev.next = l1;
    head = l1;
    rev = l2;

    
  }
  
}

  public ListNode reverse(ListNode node){

    ListNode prev = null;
    while(node != null){

      ListNode temp = node.next;
      node.next = prev;
      prev = node;
      node = temp;
      
    }
    return prev;
  }
  
}
