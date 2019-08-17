package DS;

import java.awt.List;
import java.util.ArrayList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MergeKSortedList {

	ListNode head = null;

	public static void main(String s[]) {
		MergeKSortedList mergeList = new MergeKSortedList();

		ListNode list11 = new ListNode(1);
		ListNode list12 = new ListNode(4);
		ListNode list13 = new ListNode(5);
		list11.next = list12;
		list12.next = list13;
		
		
		ListNode list21 = new ListNode(1);
		ListNode list22 = new ListNode(3);
		ListNode list23 = new ListNode(4);
		list21.next = list22;
		list22.next = list23;
		
		
		
		ListNode list31 = new ListNode(2);
		ListNode list32 = new ListNode(6);
		list31.next = list32;
		
		ListNode[] lists = { list11, list21, list31 };

		mergeList.mergeKLists(lists);

		mergeList.print(mergeList.head);

	}

	public void print(ListNode head) {
		ListNode node = head;
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public void mergeKLists(ListNode[] lists) {

		for (int i = 0; i < lists.length; i++) {
			while(lists[i] != null) {
				
					System.out.println("Here");
					insertIntoTheMergedList(lists[i]);
					lists[i] = lists[i].next;
				
			}
			
		}
	}

	private void insertIntoTheMergedList(ListNode listNode) {
		// TODO Auto-generated method stub
		ListNode node = head;
		ListNode prev = null;
		System.out.println("Insert");
		if (node == null) {
			head = new ListNode(listNode.val);
		} else {
			ListNode temp = new ListNode(listNode.val);
			while (node != null && node.val < listNode.val) {
				prev = node;
				node = node.next;
			}
			if (prev != null) {
				
				prev.next = temp;
				
			} else {
				prev = temp;
				head = prev;
			}
			temp.next = node;
		}
	}
}
