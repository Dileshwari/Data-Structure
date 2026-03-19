 package Collection;
 
public class SortList {
    public ListNode sortList(ListNode head) {
        
   
		if(head==null || head.next==null){

            return head;
        }
		ListNode mid=getMid(head);
		ListNode left=sortList(head);
		ListNode right=sortList(mid);
		
		return mergeTwoLists(left, right);
	
    }
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
	      ListNode ans=new ListNode();
	      ListNode tail=ans;
			while (first != null && second != null) {

				if (first.val < second.val) {

					tail.next=first;
	                first=first.next;
	                tail=tail.next;
				}

				else {

					tail.next=second;
	                second=second.next;
	                tail=tail.next;
				}

			}

	        tail.next=(first !=null)?first:second;
			return ans.next;
		}

	


	 ListNode getMid(ListNode head){
	   ListNode mid=null;
	 
	   while(head !=null && head.next !=null){
	         mid=(mid==null)?head: mid.next;
			 head.next=head.next.next;
	   }
	   
	   ListNode m=mid.next;
	   mid.next=null;
	   return m;

	}
	 
	 class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	  
	
}