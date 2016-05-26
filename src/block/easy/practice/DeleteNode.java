package block.easy.practice;

public class DeleteNode {

	public static void main(String[] args)
	{
		
		
	}
	//since we couldn't enter the preceding node,we can not delete the given
	//node.we can just copy the next node to the given node and delete the next
	//one.
	public void deleteNode2(ListNode node)
	{
		node.value = node.next.value;
		node.next = node.next.next;
		
	}
	
	
	public void deleteNode(ListNode head, int n)
	{
		
		if(head.next == null || head == null)
			return;
		
		ListNode presoHead = head;		
		while(head.next != null)
		{
			if(head.next.value == n)
			{				
				head.next = head.next.next;
			}
			head = head.next;
		}
		
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		if(p == null && q == null) return true;
		if(p == null || q == null) return false;
		
		if(p.value == q.value)
			return isSameTree( p.left, q.left)&& isSameTree(p.right, q.right);
		
		return false;	
	}
	
}

class ListNode
{

	int value;
	ListNode next;
	
	public ListNode() {
		// TODO Auto-generated constructor stub
	
		this.value = 0;
		next = null;
	
	}
}
